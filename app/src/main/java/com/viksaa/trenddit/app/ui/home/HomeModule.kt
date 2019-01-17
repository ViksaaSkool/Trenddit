package com.viksaa.trenddit.app.ui.home

import com.viksaa.trenddit.app.di.InjectionViewModelProvider
import com.viksaa.trenddit.app.di.qualifiers.ViewModelInjection
import dagger.Module
import dagger.Provides

@Module
class HomeModule {

    @Provides
    @ViewModelInjection
    fun provideHomeVM(
        activity: HomeActivity,
        viewModelProvider: InjectionViewModelProvider<HomeVM>
    ) = viewModelProvider.get(activity, HomeVM::class)
}