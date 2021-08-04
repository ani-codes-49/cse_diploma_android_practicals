package com.e.exp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp14_2 extends AppCompatActivity {

    ImageView imageView;
    int count=0;
    Button bt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp14_2);
        setTitle("Exp14_2");

        imageView=findViewById(R.id.img);

        bt=findViewById(R.id.btn);

        bt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imageView.setImageResource(R.mipmap.ic_launcher);
                return true;
            }
        });

    }

    public void change(View view){

                imageView.setImageResource(R.drawable.android_mobile_1);



        }

    }

