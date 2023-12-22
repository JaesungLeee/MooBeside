package com.jslee.core.deeplink.di

import com.jslee.core.deeplink.DeepLinkLauncher
import com.jslee.core.deeplink.FirebaseLinkLauncherImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/22
 */
@Module
@InstallIn(FragmentComponent::class)
internal abstract class DeepLinkModule {

    @Binds
    @FragmentScoped
    abstract fun bindDeepLinkLauncher(deepLinkLauncherImpl: FirebaseLinkLauncherImpl): DeepLinkLauncher
}