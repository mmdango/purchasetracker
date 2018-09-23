 package com.michaeldang.purchasetracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupTabLayout()
        viewPager.adapter = MainFragmentPagerAdapter(supportFragmentManager)
    }

    fun setupTabLayout() {
        tabLayout.addTab(tabLayout.newTab().setText(R.string.follow_up_tab), 0)
        tabLayout.addTab(tabLayout.newTab().setText(R.string.transactions_tab), 1)
    }

    class OnTabSelectedListenerImpl : TabLayout.OnTabSelectedListener {
        override fun onTabReselected(tab: TabLayout.Tab?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onTabUnselected(tab: TabLayout.Tab?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onTabSelected(tab: TabLayout.Tab?) {

        }

    }
}
