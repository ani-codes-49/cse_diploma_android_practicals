package com.e.exp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Exp10_2 extends AppCompatActivity {

    EditText edit,edit2,edit3,edit4,edit5;
    Button but;
    TextView t1,t2,t3,t4,t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp10_2);
        setTitle("Exp10_2");

        edit=findViewById(R.id.e1);
        edit2=findViewById(R.id.e2);
        edit3=findViewById(R.id.e3);
        edit4=findViewById(R.id.e4);
        edit5=findViewById(R.id.e5);

        but=findViewById(R.id.button);
        t1=findViewById(R.id.text1);
        t2=findViewById(R.id.text2);
        t3=findViewById(R.id.text3);
        t4=findViewById(R.id.text4);
        t5=findViewById(R.id.text5);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Exp10_2.this,"Registration Successfully",Toast.LENGTH_LONG).show();
            }
        });
    }
}
