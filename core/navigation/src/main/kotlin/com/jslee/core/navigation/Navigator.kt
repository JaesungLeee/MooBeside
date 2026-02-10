package com.jslee.core.navigation

import androidx.navigation3.runtime.NavKey

class Navigator(val navigationState: NavigationState) {
    fun navigate(target: NavKey) {
        when (target) {
            navigationState.currentTopLevelRoute -> clearBackStack()
            in navigationState.topLevelRoutes -> navigateToTopLevel(target)
            else -> navigateToRoute(target)
        }
    }

    fun navigateBack() {
        when (navigationState.currentRoute) {
            navigationState.currentTopLevelRoute -> navigationState.topLevelStack.removeLastOrNull()
            else -> navigationState.currentTopLevelBackStack.removeLastOrNull()
        }
    }

    private fun navigateToRoute(route: NavKey) {
        navigationState.currentTopLevelBackStack.apply {
            remove(route)
            add(route)
        }
    }

    private fun navigateToTopLevel(key: NavKey) {
        navigationState.topLevelStack.apply {
            remove(key)
            add(key)
        }
    }

    private fun clearBackStack() {
        navigationState.currentTopLevelBackStack.run {
            if (size > 1) subList(1, size).clear()
        }
    }
}