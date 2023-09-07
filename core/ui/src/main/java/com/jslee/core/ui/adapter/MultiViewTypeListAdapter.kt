package com.jslee.core.ui.adapter

import android.view.ViewGroup
import com.jslee.core.ui.base.BaseListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.core.ui.model.ListItem
import java.lang.reflect.ParameterizedType

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
abstract class MultiViewTypeListAdapter<T : ListItem, E : Enum<*>> :
    BaseListAdapter<T>({ it.id }) {

    private val viewTypeValues by lazy {
        getEnumClass().enumConstants ?: throw Exception("Unchecked Cast")
    }

    abstract fun onCreateViewHolder(parent: ViewGroup, viewType: E): BaseViewHolder<T>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T> {
        return onCreateViewHolder(parent, viewTypeValues[viewType])
    }

    private fun getEnumClass(): Class<E> {
        val genericSuperclass = javaClass.genericSuperclass
        val type = (genericSuperclass as ParameterizedType).actualTypeArguments[1]
        return type as Class<E>
    }
}