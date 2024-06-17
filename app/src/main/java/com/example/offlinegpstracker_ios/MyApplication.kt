package com.example.offlinegpstracker_ios

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class MyApplication : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { LocationRepository(database.locationDao()) }
}
