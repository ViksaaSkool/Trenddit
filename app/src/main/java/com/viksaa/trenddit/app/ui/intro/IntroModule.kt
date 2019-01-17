package com.viksaa.trenddit.app.ui.intro

import com.viksaa.trenddit.app.di.InjectionViewModelProvider
import com.viksaa.trenddit.app.di.qualifiers.ViewModelInjection
import dagger.Module
import dagger.Provides

@Module
class IntroModule {

    @Provides
    @ViewModelInjection
    fun provideIntroVM(
        activity: IntroActivity,
        viewModelProvider: InjectionViewModelProvider<IntroVM>
    ) = viewModelProvider.get(activity, IntroVM::class)
}