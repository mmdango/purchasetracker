package com.michaeldang.purchasetracker

import android.support.v7.util.SortedList
import com.airbnb.epoxy.EpoxyController
import com.michaeldang.purchasetracker.models.Transaction
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class FollowUpEpoxyController : EpoxyController() {
    val transactionDateSortedMap: SortedMap<Calendar, MutableList<Transaction>> = sortedMapOf()
    val dateFormat = SimpleDateFormat.getDateInstance()
    override fun buildModels() {
        for ((calendarIndex, calendar) in transactionDateSortedMap.keys.withIndex()) {
            dateRow {
                id(calendar.toString())
                dateText(dateFormat.format(calendar.time))
            }
            val transactionsForDates = transactionDateSortedMap[calendar]!!
            for ((transactionIndex, transaction) in transactionsForDates.withIndex()) {
                followUpRow {
                    id(calendarIndex.toString() + transactionIndex.toString())
                    transactionName(transaction.name)
                    amountText("$" + transaction.dollarAmount)
                }
            }
        }
    }

    fun addTransaction(transaction: Transaction) {
        val transactionsForDate = transactionDateSortedMap[transaction.date] ?: mutableListOf()
        transactionsForDate.add(transaction)
        transactionDateSortedMap[transaction.date] = transactionsForDate
    }
}