package com.artem.weatherappmvvm.ui.saved_cities_fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.androiddevs.weatherapp.utils.BaseFragment
import com.artem.weatherappmvvm.databinding.FragmentSavedCitiesBinding

class SavedCityFragment : BaseFragment<FragmentSavedCitiesBinding>() {
    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSavedCitiesBinding = FragmentSavedCitiesBinding.inflate(inflater, container, false)
}