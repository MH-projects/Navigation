package com.mh.navigation

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.frg_1.*

class Frg1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frg_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_frg1_to_frg2)
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        val fragmentManager: FragmentManager? = fragmentManager
        fragmentManager?.beginTransaction()?.detach(this)?.commitAllowingStateLoss()
        super.onConfigurationChanged(newConfig)
        fragmentManager?.beginTransaction()?.attach(this)?.commitAllowingStateLoss()
    }
}