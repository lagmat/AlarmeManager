package com.example.logonrm.alarmemanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

/**
 * Created by logonrm on 17/02/2018.
 */
class AlarmeReceiver : BroadcastReceiver(){
    private var mp: MediaPlayer? = null
    override fun onReceive(context: Context?, intent: Intent?) {

        mp = MediaPlayer.create(context, R.raw.alarm)
        mp!!.start();
        Toast.makeText(context, "Alarme....", Toast.LENGTH_LONG).show()
    }

}