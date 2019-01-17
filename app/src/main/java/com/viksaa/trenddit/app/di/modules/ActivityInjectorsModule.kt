package com.viksaa.trenddit.app.di.modules

import com.viksaa.trenddit.app.ui.home.HomeActivity
import com.viksaa.trenddit.app.ui.home.HomeModule
import com.viksaa.trenddit.app.ui.intro.IntroActivity
import com.viksaa.trenddit.app.ui.intro.IntroModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityInjectorsModule {

    @ContributesAndroidInjector(modules = [IntroModule::class])
    abstract fun introActivityInjector(): IntroActivity

    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun homeActivityInjector(): HomeActivity
}