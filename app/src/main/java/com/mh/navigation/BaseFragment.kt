package com.mh.navigation

import android.content.res.Configuration
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {

    override fun onConfigurationChanged(newConfig: Configuration) {
//        val fragmentManager: FragmentManager? = fragmentManager
//        fragmentManager?.beginTransaction()?.detach(this)?.commitAllowingStateLoss()
//        super.onConfigurationChanged(newConfig)
//        fragmentManager?.beginTransaction()?.attach(this)?.commitAllowingStateLoss()

        val fragmentManager = parentFragmentManager
        fragmentManager.beginTransaction().detach(this).commitAllowingStateLoss()
        super.onConfigurationChanged(newConfig)
        fragmentManager.beginTransaction().attach(this).commitAllowingStateLoss()
    }
}