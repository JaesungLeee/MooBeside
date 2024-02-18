package com.jslee.core.external.di

import com.jslee.core.external.ExternalLauncher
import com.jslee.core.external.ExternalLauncherImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/01
 */
@Module
@InstallIn(FragmentComponent::class)
internal abstract class ExternalLauncherModule {

    @Binds
    @FragmentScoped
    abstract fun bindExternalLauncher(externalLauncherImpl: ExternalLauncherImpl): ExternalLauncher
}