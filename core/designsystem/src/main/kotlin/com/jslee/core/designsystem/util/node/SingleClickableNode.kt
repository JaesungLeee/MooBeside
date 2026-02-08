package com.jslee.core.designsystem.util.node

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.material3.ripple
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
import androidx.compose.ui.node.DelegatingNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.PointerInputModifierNode
import androidx.compose.ui.node.SemanticsModifierNode
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.SemanticsPropertyReceiver
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.role
import com.jslee.core.designsystem.util.MultipleEventsCutter
import com.jslee.core.designsystem.util.create

data class SingleClickableElement(
    private val interactionSource: MutableInteractionSource?,
    private val enabled: Boolean,
    private val onClickLabel: String?,
    private val role: Role?,
    private val onClick: () -> Unit,
) : ModifierNodeElement<SingleClickableNode>() {
    // Modifier 최초 적용
    override fun create(): SingleClickableNode {
        return SingleClickableNode(
            interactionSource = interactionSource,
            enabled = enabled,
            onClickLabel = onClickLabel,
            role = role,
            onClick = onClick,
        )
    }

    // recomposition 시 Modifier 재생성이 아닌 기존 Node에 값만 변경하도록
    override fun update(node: SingleClickableNode) {
        node.update(interactionSource, enabled, onClickLabel, role, onClick)
    }
}

class SingleClickableNode(
    private var interactionSource: MutableInteractionSource?,
    private var enabled: Boolean,
    private var onClickLabel: String?,
    private var role: Role?,
    private var onClick: () -> Unit,
) : DelegatingNode(), SemanticsModifierNode {
    private val cutter = MultipleEventsCutter.create()

    // Ripple indication을 위한 Node
    private var indicationNodeDelegate =
        delegate(ripple().create(interactionSource ?: MutableInteractionSource()))

    // Pointer Input을 위한 Node
    private var pointerInputNode: PointerInputModifierNode? = null

    // Node 활성화 시
    override fun onAttach() {
        super.onAttach()
        updatePointerInputNode()
    }

    override fun SemanticsPropertyReceiver.applySemantics() {
        this.role = role

        onClick(
            label = onClickLabel,
            action = {
                if (enabled) {
                    cutter.processEvent(event = onClick)
                    true
                } else {
                    false
                }
            }
        )

        if (enabled.not()) disabled()
    }

    fun update(
        interactionSource: MutableInteractionSource?,
        enabled: Boolean,
        onClickLabel: String?,
        role: Role?,
        onClick: () -> Unit,
    ) {
        val interactionSourceChanged = this.interactionSource != interactionSource
        val enabledChanged = this.enabled != enabled

        this.interactionSource = interactionSource
        this.enabled = enabled
        this.onClickLabel = onClickLabel
        this.role = role
        this.onClick = onClick

        if (interactionSourceChanged) {
            undelegate(indicationNodeDelegate)
            indicationNodeDelegate = delegate(
                ripple().create(interactionSource ?: MutableInteractionSource())
            )
        }

        if (enabledChanged || interactionSourceChanged) {
            updatePointerInputNode()
        }
    }

    private fun updatePointerInputNode() {
        pointerInputNode?.let { undelegate(it) }

        pointerInputNode = delegate(
            SuspendingPointerInputModifierNode {
                detectTapGestures(
                    onPress = { offset ->
                        if (enabled) {
                            val press = PressInteraction.Press(offset)
                            interactionSource?.emit(press)
                            val isReleased = tryAwaitRelease()
                            if (isReleased) {
                                interactionSource?.emit(PressInteraction.Release(press))
                            } else {
                                interactionSource?.emit(PressInteraction.Cancel(press))
                            }
                        }
                    },
                    onTap = { _ ->
                        if (enabled) cutter.processEvent(event = onClick)
                    }
                )
            }
        )
    }
}