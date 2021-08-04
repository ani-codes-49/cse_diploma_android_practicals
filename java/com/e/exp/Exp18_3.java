package com.e.exp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp18_3 extends AppCompatActivity {

    EditText editText;
    long fact=1;
    static String ans;
    Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp18_3);
        setTitle("Exp18_3");

        editText=findViewById(R.id.enter);

    }

    public void fact(View view){

        fact=Long.parseLong(editText.getText().toString());
        Log.e("Tag","Messgage"+fact);

        for(int i = (int) (fact-1); i>0; i--){

            fact=i*fact;
            Log.e("Tag","Messgage"+fact);

        }


        ans=String.valueOf(fact);

        intent=new Intent(Exp18_3.this,Exp18_3_1.class)/*.putExtra("Factorial",ans)*/;
        startActivity(intent);

    }

    public static String getAns(){

        return ans;

    }
}
