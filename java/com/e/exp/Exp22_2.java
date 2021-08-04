package com.e.exp;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Exp22_2 extends AppCompatActivity {

    private SensorManager sensorManager;
    private Sensor sensor,sensor1;
    private TriggerEventListener triggerEventListener;
    private RelativeLayout relativeLayou;
    private boolean flag=false;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp22_2);
        setTitle("Exp22_2");

        relativeLayou = findViewById(R.id.rel);
        callme();

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)

    public void callme() {

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = ((SensorManager) getSystemService(Context.SENSOR_SERVICE)).getDefaultSensor(Sensor.TYPE_SIGNIFICANT_MOTION);




                    triggerEventListener = new TriggerEventListener() {
                        @Override
                        public void onTrigger(TriggerEvent event) {

                            relativeLayou.setBackgroundColor(Color.YELLOW);

                        }

                    };
                    sensorManager.requestTriggerSensor(triggerEventListener, sensor);


    }
}
