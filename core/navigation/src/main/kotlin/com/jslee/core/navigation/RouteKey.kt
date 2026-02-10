package com.jslee.core.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface RouteKey : NavKey

@Serializable
data object Showing : RouteKey

@Serializable
data object BoxOffice : RouteKey

@Serializable
data object BookMark : RouteKey
