package com.e.exp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Exp9_2 extends AppCompatActivity {

    EditText no1,no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp9_2);
        setTitle("Exp9_2");

        no1=findViewById(R.id.num1);
        no2=findViewById(R.id.num2);

    }

        public void add (View view){

        double num1 = Double.parseDouble(no1.getText().toString());
        double num2 = Double.parseDouble(no2.getText().toString());
        double res = num1 + num2;

        String ans = String.valueOf(res);

        Toast.makeText(this, "Addition: " + ans, Toast.LENGTH_LONG).show();

    }

        public void sub (View view){

        double num1 = Double.parseDouble(no1.getText().toString());
        double num2 = Double.parseDouble(no2.getText().toString());
        double res = num1 - num2;

        String ans = String.valueOf(res);

        Toast.makeText(this, "Subtraction: " + ans, Toast.LENGTH_LONG).show();

    }

        public void mul (View view){

        double num1 = Double.parseDouble(no1.getText().toString());
        double num2 = Double.parseDouble(no2.getText().toString());
        double res = num1 * num2;

        String ans = String.valueOf(res);

        Toast.makeText(this, "Multiplication: " + ans, Toast.LENGTH_LONG).show();

    }

        public void div (View view){

        double num1 = Double.parseDouble(no1.getText().toString());
        double num2 = Double.parseDouble(no2.getText().toString());
        double res = num1 / num2;

        String ans = String.valueOf(res);

        Toast.makeText(this, "Division: " + ans, Toast.LENGTH_LONG).show();

    }

        public void clear (View view){

        no1.setText("");
        no2.setText("");

    }



}
