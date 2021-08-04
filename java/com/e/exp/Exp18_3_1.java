package com.e.exp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp18_3_1 extends AppCompatActivity {

    TextView textView;
    String answer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp18_3_1);
        setTitle("Exp18_3_1");

        textView=findViewById(R.id.fact);

        /*answer=getIntent().getStringExtra("Factorial");*/

        answer=Exp18_3.getAns();
        textView.setText("Factorial of Entered Number is: "+" "+answer);

    }
}
