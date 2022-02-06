package com.artem.weatherappmvvm.ui.details_fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.androiddevs.weatherapp.utils.BaseFragment
import com.artem.weatherappmvvm.databinding.FragmentDetailsBinding


class DetailsFragment : BaseFragment<FragmentDetailsBinding>(){
    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailsBinding =FragmentDetailsBinding.inflate(inflater,container,false)

}