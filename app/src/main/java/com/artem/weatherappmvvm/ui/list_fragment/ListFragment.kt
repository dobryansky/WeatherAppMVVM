package com.artem.weatherappmvvm.ui.list_fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.androiddevs.weatherapp.utils.BaseFragment
import com.artem.weatherappmvvm.databinding.FragmentListBinding


class ListFragment : BaseFragment<FragmentListBinding>() {
    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentListBinding =
        FragmentListBinding.inflate(inflater, container, false)



}