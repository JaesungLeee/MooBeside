package com.jslee.core.deeplink.di

import com.jslee.core.deeplink.DeepLinkLauncher
import com.jslee.core.deeplink.FirebaseLinkLauncherImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/22
 */
@Module
@InstallIn(ViewModelComponent::class)
internal abstract class DeepLinkModule {

    @Binds
    @ViewModelScoped
    abstract fun bindDeepLinkLauncher(deepLinkLauncherImpl: FirebaseLinkLauncherImpl): DeepLinkLauncher
}