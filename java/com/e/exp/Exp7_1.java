package com.e.exp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Exp7_1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp7_1);
        setTitle("Exp7_1");
    }


    public void info()

    {
        Toast.makeText(this,"Registration successful !",Toast.LENGTH_SHORT).show();

    }

}
