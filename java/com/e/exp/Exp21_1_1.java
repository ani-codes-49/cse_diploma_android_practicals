package com.e.exp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Exp21_1_1 extends BroadcastReceiver {



    @Override
    public void onReceive(Context context, Intent intent) {


        String get = intent.getAction();

        if (get.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
            Toast.makeText(context, "Power Disconnected", Toast.LENGTH_SHORT).show();

        } else if (get.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
            Toast.makeText(context, "Power Connected", Toast.LENGTH_SHORT).show();

        } else if (get.equals("android.intent.action.WALLPAPER_CHANGED")) {
            Toast.makeText(context, "Wallpaper Changed", Toast.LENGTH_SHORT).show();

        }
    }
}
