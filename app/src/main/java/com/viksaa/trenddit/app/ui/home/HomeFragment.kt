package com.viksaa.trenddit.app.ui.home

import com.viksaa.trenddit.app.R
import com.viksaa.trenddit.app.di.ViewModelInjectionField
import com.viksaa.trenddit.app.di.qualifiers.ViewModelInjection
import com.viksaa.trenddit.app.ui.BaseFragment
import javax.inject.Inject

class HomeFragment : BaseFragment() {

    override fun layoutRes() = R.layout.fragment_home

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }

    @Inject
    @ViewModelInjection
    lateinit var viewModel: ViewModelInjectionField<HomeFragmentVM>



}