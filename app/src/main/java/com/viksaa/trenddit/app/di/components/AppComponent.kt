package com.viksaa.trenddit.app.di.components

import com.viksaa.trenddit.app.TredditApp
import com.viksaa.trenddit.app.di.modules.ActivityInjectorsModule
import com.viksaa.trenddit.app.di.modules.AppModule
import com.viksaa.trenddit.app.di.modules.FragmentInjectorsModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

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
        fun application(application: TredditApp): Builder

        fun build(): AppComponent
    }

    fun inject(tredditApp: TredditApp)

}