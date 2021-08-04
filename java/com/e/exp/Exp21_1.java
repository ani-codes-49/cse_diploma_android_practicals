package com.e.exp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp21_1 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp21_1);
        setTitle("Exp21_1");

        intent=new Intent();

        intent.setAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intent.setAction("android.intent.action.ACTION_POWER_CONNECTED");

        sendBroadcast(intent);

    }

   /* public void call(View view){

        intent.setAction("android.intent.action.DATE_CHANGED");
        sendBroadcast(intent);

    }*/
}
