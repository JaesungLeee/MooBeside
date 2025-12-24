package com.jslee.core.designsystem.di

import com.jslee.core.designsystem.tooltip.builder.TooltipBuilder
import com.jslee.core.designsystem.tooltip.builder.TooltipBuilderImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/23
 */
@Module
@InstallIn(FragmentComponent::class)
abstract class TooltipModule {

    @Binds
    @FragmentScoped
    abstract fun bindTooltipBuilder(tooltipBuilderImpl: TooltipBuilderImpl): TooltipBuilder

}