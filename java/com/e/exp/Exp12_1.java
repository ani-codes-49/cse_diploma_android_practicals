package com.e.exp;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp12_1 extends AppCompatActivity {

    RadioButton rb,rb1,rb2;
    RadioGroup rg1;
    int i;
    StringBuilder stringBuilder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp12_1);
        setTitle("Exp12_1");

        rb1=findViewById(R.id.r1);
        rb2=findViewById(R.id.r2);
        rg1=findViewById(R.id.rg);


    }

    public void check(View view) {

        try {

            stringBuilder = new StringBuilder();

            if (rb1.isChecked()) {

                stringBuilder.append(rb1.getText().toString());

            } else if (rb2.isChecked()) {

                stringBuilder.append(rb2.getText().toString());

            } else if (!rb1.isChecked() && rb2.isChecked()) {

                stringBuilder.append("Null");

            }


            i = rg1.getCheckedRadioButtonId();
            rb = findViewById(i);

            Toast.makeText(this, stringBuilder.toString() + " " + rb.getText().toString(), Toast.LENGTH_SHORT).show();

        }
        catch (Exception e){

            Toast.makeText(this,"Nothing is selected",Toast.LENGTH_SHORT).show();

        }
    }


}
