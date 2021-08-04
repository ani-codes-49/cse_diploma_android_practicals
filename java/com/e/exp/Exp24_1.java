package com.e.exp;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Set;

public class Exp24_1 extends AppCompatActivity {

    BluetoothAdapter bluetoothAdapter;
    Set<BluetoothDevice> pairedDevices;
    String devices;
    ArrayAdapter arrayAdapter;
    ArrayList arrayList;
    ListView listView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp24_1);
        setTitle("Exp24_1");

        bluetoothAdapter=BluetoothAdapter.getDefaultAdapter();

        if (bluetoothAdapter==null)
        {

            Toast.makeText(this,"Bluetooth Not Available",Toast.LENGTH_LONG).show();

        }
    }

    public void on(View view){

        if(bluetoothAdapter.isEnabled()) {

            Toast.makeText(this,"Bluetooth is already ON",Toast.LENGTH_SHORT).show();

        }
        else {
            startActivity(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE));
            Toast.makeText(this,"Bluetooth Turned ON",Toast.LENGTH_SHORT).show();

        }

    }

    public void off(View view){

        if(bluetoothAdapter.isEnabled()){

            try {
                startActivity(new Intent(String.valueOf(bluetoothAdapter.disable())));
            }
            catch (ActivityNotFoundException e){

                Toast.makeText(this,"Bluetooth Turned OFF",Toast.LENGTH_SHORT).show();

            }
        }

    }

    public void list(View view){

        pairedDevices=bluetoothAdapter.getBondedDevices();

        if(!bluetoothAdapter.isEnabled()){

            Toast.makeText(this,"Bluetooth is off ",Toast.LENGTH_SHORT).show();

        }

        else if(pairedDevices.size()>0){

            listView=findViewById(R.id.devices);
            arrayList=new ArrayList<String>();

            for (BluetoothDevice device : pairedDevices){

                devices=device.getName();
                Log.e("Tag","Message"+" "+devices);
                arrayList.add(devices);

            }

            arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
            listView.setAdapter(arrayAdapter);

        }

    }

    public void vis(View view){

        startActivity(new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE));

    }

}
