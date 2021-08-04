package com.e.exp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp9_1 extends AppCompatActivity {

    ToggleButton t1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp9_1);
        setTitle("Exp9_1");

        t1=findViewById(R.id.tog);

    }

    public void check(View view){

        if(t1.getText().toString().equals("ON")){

            Toast.makeText(this,"Toggle ON",Toast.LENGTH_LONG).show();

        }

        else if(t1.getText().toString().equals("OFF")){

            Toast.makeText(this,"Toggle OFF",Toast.LENGTH_LONG).show();

        }
    }
}
