package com.example.SnapWorkout

import android.app.Application
import com.example.SnapWorkout.database.HistoryDatabase

class WorkOutApp: Application() {

    val db: HistoryDatabase by lazy {
        HistoryDatabase.getInstance(this)
    }
}