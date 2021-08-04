package com.e.exp;

import android.os.Bundle;
import android.widget.TimePicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp16_1 extends AppCompatActivity {

    TimePicker time;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp16_1);
        setTitle("Exp16_1");

        time=findViewById(R.id.tp1);
        time.setIs24HourView(true);

    }
}
