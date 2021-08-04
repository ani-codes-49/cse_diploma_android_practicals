package com.e.exp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Exp10_1 extends AppCompatActivity {
    Button b1;
    EditText e,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp10_1);
        setTitle("Exp10_1");

        b1=findViewById(R.id.b1);
        e=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e.getText().toString().equals("LESP") && e2.getText().toString().equals("Shaikh")) {
                    Toast.makeText(Exp10_1.this,"Successfully",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Exp10_1.this,"Login UnSuccessfully",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

