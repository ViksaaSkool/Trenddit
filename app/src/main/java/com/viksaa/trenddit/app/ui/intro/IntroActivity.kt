package com.viksaa.trenddit.app.ui.intro

import android.os.Bundle
import com.viksaa.trenddit.app.R
import com.viksaa.trenddit.app.di.ViewModelInjectionField
import com.viksaa.trenddit.app.di.qualifiers.ViewModelInjection
import com.viksaa.trenddit.app.ui.BaseActivity
import javax.inject.Inject

class IntroActivity : BaseActivity() {

    @Inject
    @ViewModelInjection
    lateinit var viewModel: ViewModelInjectionField<IntroVM>

    override fun layoutRes() = R.layout.activity_intro

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}