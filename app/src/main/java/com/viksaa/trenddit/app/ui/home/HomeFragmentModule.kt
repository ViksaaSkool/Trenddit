package com.viksaa.trenddit.app.ui.home

import com.viksaa.trenddit.app.di.InjectionViewModelProvider
import com.viksaa.trenddit.app.di.qualifiers.ViewModelInjection
import dagger.Module
import dagger.Provides

@Module
class HomeFragmentModule {

    @Provides
    @ViewModelInjection
    fun provideHomeVM(
        fragment: HomeFragment,
        viewModelProvider: InjectionViewModelProvider<HomeFragmentVM>
    ) = viewModelProvider.get(fragment, HomeFragmentVM::class)



}