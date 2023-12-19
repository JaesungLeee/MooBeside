package com.jslee.core.ui.base.view

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
abstract class BaseActivity<VB : ViewDataBinding>(@LayoutRes private val layoutId: Int) :
    AppCompatActivity() {

    lateinit var binding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)

        initViews()
    }

    open fun initViews() {}
}