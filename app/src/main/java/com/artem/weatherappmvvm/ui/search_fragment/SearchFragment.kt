package com.artem.weatherappmvvm.ui.search_fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.androiddevs.weatherapp.utils.BaseFragment
import com.artem.weatherappmvvm.databinding.FragmentSearchWeatherBinding

class SearchFragment : BaseFragment<FragmentSearchWeatherBinding>() {
    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchWeatherBinding =
        FragmentSearchWeatherBinding.inflate(inflater, container, false)
}