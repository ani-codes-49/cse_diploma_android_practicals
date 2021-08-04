package com.e.exp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Exp15_2 extends AppCompatActivity {

    float tot = 0;
    CheckBox ch1, ch2, ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp15_2);
        setTitle("Exp15_2");

        ch1 = findViewById(R.id.checkBox);
        ch2 = findViewById(R.id.checkBox2);
        ch3 = findViewById(R.id.checkBox3);



    }

    public void order(View view) {

        StringBuilder res = new StringBuilder();

        if (ch1.isChecked()) {

            tot += 60;
            res.append(" Pizza\n");

        }

        if (ch2.isChecked()) {

            tot += 40;
            res.append(" Coffee\n");

        }
        if (ch3.isChecked()) {

            tot += 50;
            res.append("Burger");

        }

        Toast.makeText(this, "Your Orders : \n" + res + "\nTotal : " + tot, Toast.LENGTH_SHORT).show();
        tot=0;
        callme();


    }


    public void callme(){

        new Thread(new Runnable() {
            @Override
            public void run() {

                if (!ch1.isChecked()){

                    tot-=60;

                }

                else if(!ch2.isChecked()){

                    tot-=40;

                }

                else if(!ch3.isChecked()){

                    tot-=50;

                }

            }
        });
    }
}



