package com.procedure.phonestate

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val batteryStats = BatteryState(this).getBatteryStats()
        val memory = StorageState(this).memoryStatus()
        val storageState = StorageState(this).storageStatus()
        Log.d("Battery Status", "" + BatteryState(this).getBatteryStats().percentage)
    }
}
