package com.michaeldang.purchasetracker

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.View

/**
 * Created by Brian Dang on 9/16/2018.
 */
class MainFragmentPagerAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {

    val followUpFragment = FollowUpFragment()

    override fun getItem(position: Int): Fragment {
        return followUpFragment
    }

    override fun getCount(): Int {
        return 1
    }

}