package com.jslee.core.designsystem.util.node

import androidx.compose.foundation.IndicationNodeFactory
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
import androidx.compose.ui.node.DelegatableNode
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
    private val indicationNodeFactory: IndicationNodeFactory?,
    private val interactionSource: MutableInteractionSource?,
    private val enabled: Boolean,
    private val onClickLabel: String?,
    private val role: Role?,
    private val onClick: () -> Unit,
) : ModifierNodeElement<SingleClickableNode>() {
    // Modifier 최초 적용
    override fun create(): SingleClickableNode {
        return SingleClickableNode(
            indicationNodeFactory = indicationNodeFactory,
            interactionSource = interactionSource,
            enabled = enabled,
            onClickLabel = onClickLabel,
            role = role,
            onClick = onClick,
        )
    }

    // recomposition 시 Modifier 재생성이 아닌 기존 Node에 값만 변경하도록
    override fun update(node: SingleClickableNode) {
        node.update(indicationNodeFactory, interactionSource, enabled, onClickLabel, role, onClick)
    }
}

class SingleClickableNode(
    private var indicationNodeFactory: IndicationNodeFactory?,
    private var interactionSource: MutableInteractionSource?,
    private var enabled: Boolean,
    private var onClickLabel: String?,
    private var role: Role?,
    private var onClick: () -> Unit,
) : DelegatingNode(), SemanticsModifierNode {
    private val cutter = MultipleEventsCutter.create()

    private val internalInteractionSource = MutableInteractionSource()
    private var resolvedInteractionSource: MutableInteractionSource =
        interactionSource ?: internalInteractionSource

    // Ripple indication을 위한 Node
    private var indicationNodeDelegate: DelegatableNode? =
        indicationNodeFactory?.let { factory ->
            delegate(factory.create(resolvedInteractionSource))
        }

    // Pointer Input을 위한 Node
    private var pointerInputNode: PointerInputModifierNode? = null

    // Node 활성화 시
    override fun onAttach() {
        super.onAttach()
        updateIndicationNode()
        updatePointerInputNode()
    }

    override fun SemanticsPropertyReceiver.applySemantics() {
        role?.let { this.role = it }

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
        indicationNodeFactory: IndicationNodeFactory?,
        interactionSource: MutableInteractionSource?,
        enabled: Boolean,
        onClickLabel: String?,
        role: Role?,
        onClick: () -> Unit,
    ) {
        val newResolved = interactionSource ?: internalInteractionSource
        val resolvedChanged = resolvedInteractionSource !== newResolved
        val indicationChanged = this.indicationNodeFactory !== indicationNodeFactory
        val enabledChanged = this.enabled != enabled

        this.indicationNodeFactory = indicationNodeFactory
        this.interactionSource = interactionSource
        this.enabled = enabled
        this.onClickLabel = onClickLabel
        this.role = role
        this.onClick = onClick

        resolvedInteractionSource = newResolved

        if (resolvedChanged || indicationChanged) {
            updateIndicationNode()
        }

        if (enabledChanged || resolvedChanged) {
            updatePointerInputNode()
        }
    }

    private fun updateIndicationNode() {
        indicationNodeDelegate?.let { undelegate(it) }
        indicationNodeDelegate = null

        val factory = indicationNodeFactory ?: return
        indicationNodeDelegate = delegate(factory.create(resolvedInteractionSource))
    }

    private fun updatePointerInputNode() {
        pointerInputNode?.let { undelegate(it) }

        pointerInputNode = delegate(
            SuspendingPointerInputModifierNode {
                detectTapGestures(
                    onPress = { offset ->
                        if (enabled) {
                            val press = PressInteraction.Press(offset)
                            resolvedInteractionSource.emit(press)
                            val isReleased = tryAwaitRelease()
                            if (isReleased) {
                                resolvedInteractionSource.emit(PressInteraction.Release(press))
                            } else {
                                resolvedInteractionSource.emit(PressInteraction.Cancel(press))
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
