package com.hedroid.notificationapp

import android.app.NotificationManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import com.hedroid.notificationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.high.setOnClickListener{
           val notification= NotificationCompat.Builder(this,App().CHANNEL_ID1 )
            notification.setContentTitle(binding.title.text.toString())
            notification.setContentText(binding.content.text.toString())
            notification.setSmallIcon(R.drawable.ic_android_black_24dp)
                notification.setPriority(NotificationCompat.PRIORITY_HIGH)
                .build()
            val manager=getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.notify(1,notification.build())

        }
        binding.low.setOnClickListener{
            val notification= NotificationCompat.Builder(this,App().CHANNEL_ID2 )
            notification.setContentTitle(binding.title.text.toString())
            notification.setContentText(binding.content.text.toString())
            notification.setSmallIcon(R.drawable.ic_android_black_24dp)
            notification.setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .build()
            val manager=getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.notify(2,notification.build())

        }
    }
}