package com.viksaa.trenddit.app.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import javax.inject.Inject
import kotlin.reflect.KClass

typealias ViewModelInjectionField<T> = dagger.Lazy<T>

class InjectionViewModelProvider<VM : ViewModel> @Inject constructor(
    private val lazyViewModel: dagger.Lazy<VM>
) {

    @Suppress("UNCHECKED_CAST")
    private val viewModelFactory = object : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>) = lazyViewModel.get() as T
    }

    fun <ACTIVITY : FragmentActivity> get(activity: ACTIVITY, viewModelClass: KClass<VM>) =
        ViewModelProviders.of(activity, viewModelFactory).get(viewModelClass.java)

    fun <FRAGMENT : Fragment> get(fragment: FRAGMENT, viewModelClass: KClass<VM>) =
        ViewModelProviders.of(fragment, viewModelFactory).get(viewModelClass.java)
}