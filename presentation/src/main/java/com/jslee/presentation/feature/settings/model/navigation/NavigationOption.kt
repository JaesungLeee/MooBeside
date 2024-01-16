package com.jslee.presentation.feature.settings.model.navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/08
 */
@Parcelize
data class NavigationOption(
    val navigationType: NavigationType,
    val navigationPath: NavigationPath,
) : Parcelable
