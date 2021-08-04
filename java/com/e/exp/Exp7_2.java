package com.e.exp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Exp7_2 extends AppCompatActivity {

    TextView t1,t2;
    EditText pass,num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp7_2);

        setTitle("Exp7_2");

        num=findViewById(R.id.name);
        pass=findViewById(R.id.password);
        t1=findViewById(R.id.name2);
        t2=findViewById(R.id.password1);
        t1.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.INVISIBLE);
    }

    public void log(View view){

        if(num.getText().toString().equals("admin") && pass.getText().toString().equals("12345"))
        {
            t1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);

            t1.setText("Name: "+num.getText().toString());
            t2.setText("Password: "+pass.getText().toString());

            Toast.makeText(Exp7_2.this,"Login Successful... !",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(Exp7_2.this,"Login Unsuccessful... !",Toast.LENGTH_SHORT).show();
            t2.setVisibility(View.INVISIBLE);
            t1.setVisibility(View.INVISIBLE);
        }

    }


}
