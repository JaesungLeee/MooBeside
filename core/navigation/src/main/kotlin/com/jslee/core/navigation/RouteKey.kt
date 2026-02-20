package com.jslee.core.navigation

import androidx.navigation3.runtime.NavKey

@Serializable
data object BoxOffice : RouteKey

@Serializable
data object BookMark : RouteKey
interface RouteKey : NavKey
