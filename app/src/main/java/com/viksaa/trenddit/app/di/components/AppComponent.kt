package com.viksaa.trenddit.app.di.components

import com.viksaa.trenddit.app.App
import com.viksaa.trenddit.app.di.modules.ActivityInjectorsModule
import com.viksaa.trenddit.app.di.modules.FragmentInjectorsModule
import com.viksaa.trenddit.app.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton
import kotlin.text.Typography.dagger

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityInjectorsModule::class,
        FragmentInjectorsModule::class,
        AppModule::class]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)

}