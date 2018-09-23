package com.michaeldang.purchasetracker

import android.app.Application
import com.facebook.stetho.Stetho

class CustomApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this);
    }
}