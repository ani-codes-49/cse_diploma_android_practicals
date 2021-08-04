package com.e.exp;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp15_1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp15_1);
        setTitle("Exp15_1");

    }

    public void show(View view){

        Context context=getApplicationContext();
        LayoutInflater inflater=getLayoutInflater();
        View view1=inflater.inflate(R.layout.toast,null);
        Toast toast=new Toast(context);

        toast.setView(view1);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();

    }
}
