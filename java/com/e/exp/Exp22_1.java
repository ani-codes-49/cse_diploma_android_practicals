package com.e.exp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Exp22_1 extends AppCompatActivity{

    ListView listView;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;
    SensorManager sensorManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp22_1);
        setTitle("Exp22_1");

        callme();

    }

    public void callme(){


        listView=findViewById(R.id.sens);

        arrayList=new ArrayList<String>();
        sensorManager= (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        for(Sensor s:sensorManager.getSensorList(Sensor.TYPE_ALL)){


            arrayList.add(s.getName());

        }

        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);


    }
}
