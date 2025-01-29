package com.moobeside.core.common.ui.recyclerview.model

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
interface ListItem {
    val id: Long
    val viewType: Enum<*>
}