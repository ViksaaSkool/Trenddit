package com.viksaa.trenddit.app.ui.home

import android.os.Bundle
import com.viksaa.trenddit.app.R
import com.viksaa.trenddit.app.di.ViewModelInjectionField
import com.viksaa.trenddit.app.di.qualifiers.ViewModelInjection
import com.viksaa.trenddit.app.ui.BaseActivity
import javax.inject.Inject

class HomeActivity : BaseActivity() {

    @Inject
    @ViewModelInjection
    lateinit var viewModel: ViewModelInjectionField<HomeVM>

    override fun layoutRes() = R.layout.activity_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}