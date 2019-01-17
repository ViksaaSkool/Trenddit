package com.viksaa.trenddit.app.di.modules

import com.viksaa.trenddit.app.ui.home.HomeFragment
import com.viksaa.trenddit.app.ui.home.HomeFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentInjectorsModule {

    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    abstract fun homeFragmentInjector(): HomeFragment
}