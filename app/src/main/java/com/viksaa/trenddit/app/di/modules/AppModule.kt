package com.viksaa.trenddit.app.di.modules

import android.app.Application
import android.content.Context
import com.viksaa.trenddit.app.TredditApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(tredditApp: TredditApp): Application = tredditApp

    @Provides
    @Singleton
    fun provideApplicationContext(tredditApp: TredditApp): Context = tredditApp.applicationContext

}