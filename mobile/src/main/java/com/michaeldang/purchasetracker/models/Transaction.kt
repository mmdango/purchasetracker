package com.michaeldang.purchasetracker.models

import java.util.*
import kotlin.Comparator

data class Transaction(val name: String, val date: Calendar, val dollarAmount: Double, val followUpState: FollowUpState): Comparable<Transaction> {
    override fun compareTo(other: Transaction): Int {
        return date.compareTo(other.date)
    }

}