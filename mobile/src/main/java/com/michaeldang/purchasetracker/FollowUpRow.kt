package com.michaeldang.purchasetracker

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.View
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import kotlinx.android.synthetic.main.follow_up_row.view.*

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class FollowUpRow @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        View.inflate(context, R.layout.follow_up_row, this)
    }

    @TextProp
    fun setTransactionName(text: CharSequence) {
        transactionNameText.setText(text)
    }

    @TextProp
    fun setAmountText(text: CharSequence) {
        amountText.setText(text)
    }
}