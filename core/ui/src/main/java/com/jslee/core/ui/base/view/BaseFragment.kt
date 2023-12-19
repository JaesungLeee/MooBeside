package com.jslee.core.ui.base.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
abstract class BaseFragment<VB : ViewDataBinding>(
    @LayoutRes private val layoutId: Int,
) : Fragment() {

    private var _binding: VB? = null
    val binding: VB get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner

        initViews()
        observeStates()
    }

    open fun initViews() {}

    open fun observeStates() {}

    protected fun repeatOn(
        lifecycle: Lifecycle.State = Lifecycle.State.STARTED,
        builder: suspend CoroutineScope.() -> Unit,
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(lifecycle, builder)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}