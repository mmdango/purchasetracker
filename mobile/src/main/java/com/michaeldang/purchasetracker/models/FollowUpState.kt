package com.michaeldang.purchasetracker.models

import java.util.*

enum class FollowUpState(){
    WILL_FOLLOW_UP,
    WILL_NOT_FOLLOW_UP,
    WILL_FOLLOW_UP_SNOOZED,
    HAS_FOLLOWED_UP
}