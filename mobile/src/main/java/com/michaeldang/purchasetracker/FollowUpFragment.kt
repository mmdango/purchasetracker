package com.michaeldang.purchasetracker

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.michaeldang.purchasetracker.models.FollowUpState
import com.michaeldang.purchasetracker.models.Transaction
import kotlinx.android.synthetic.main.recycler_view_layout.view.*
import java.util.*

class FollowUpFragment : Fragment() {
    val epoxyController = FollowUpEpoxyController()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.recycler_view_layout, container, false)

        view.recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        view.recyclerView.adapter = epoxyController.adapter
        populateWithDummyData()
        epoxyController.requestModelBuild()

        return view
    }

    fun populateWithDummyData() {
        val date1 = GregorianCalendar()
        val date2 = GregorianCalendar()
        date1.set(2018, 2, 5)
        date2.set(2018, 2, 8)
        val transaction1 = Transaction("Mcdonalds", date1, 23.34, FollowUpState.WILL_NOT_FOLLOW_UP)
        val transaction2 = Transaction("Jackalope Bar", date1, 110.0, FollowUpState.WILL_NOT_FOLLOW_UP)
        val transaction3 = Transaction("Amazon", date1, 65.43, FollowUpState.WILL_NOT_FOLLOW_UP)
        val transaction4 = Transaction("Shells Gas Station", date1, 18.95, FollowUpState.WILL_NOT_FOLLOW_UP)
        val transaction5 = Transaction("Safeway", date1, 45.32, FollowUpState.WILL_NOT_FOLLOW_UP)
        val transaction6 = Transaction("Uber", date1, 4.05, FollowUpState.WILL_NOT_FOLLOW_UP)
        val transaction7 = Transaction("Zeal PC", date1, 922.12, FollowUpState.WILL_NOT_FOLLOW_UP)
        val transaction8 = Transaction("Airbnb", date2, 433.21, FollowUpState.WILL_NOT_FOLLOW_UP)
        val transaction9 = Transaction("Uber", date2, 12.01, FollowUpState.WILL_NOT_FOLLOW_UP)
        val transaction10 = Transaction("Safeway", date2, 6.26, FollowUpState.WILL_NOT_FOLLOW_UP)
        val transaction11 = Transaction("Amazon", date2, 27.98, FollowUpState.WILL_NOT_FOLLOW_UP)

        epoxyController.addTransaction(transaction1)
        epoxyController.addTransaction(transaction2)
        epoxyController.addTransaction(transaction3)
        epoxyController.addTransaction(transaction4)
        epoxyController.addTransaction(transaction5)
        epoxyController.addTransaction(transaction6)
        epoxyController.addTransaction(transaction7)
        epoxyController.addTransaction(transaction8)
        epoxyController.addTransaction(transaction9)
        epoxyController.addTransaction(transaction10)
        epoxyController.addTransaction(transaction11)
    }
}