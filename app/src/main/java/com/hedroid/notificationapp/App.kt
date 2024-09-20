package com.hedroid.notificationapp

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.annotation.RequiresApi

class App :Application(){
val CHANNEL_ID1="CHANNEL_ID1"
val CHANNEL_ID2="CHANNEL_ID2"

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            val channel1=NotificationChannel(CHANNEL_ID1,
                "Channel 1",NotificationManager.IMPORTANCE_HIGH)
            channel1.description="this is my high important channel for notification"

            val channel2=NotificationChannel(CHANNEL_ID1,
                "Channel 2",NotificationManager.IMPORTANCE_DEFAULT)
            channel2.description="this is my default important channel for notification"
            getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            createNotificationChannels()
            createNotificationChannels()
        }
    }

}

private fun createNotificationChannels() {


}
