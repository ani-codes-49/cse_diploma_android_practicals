package com.e.exp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp18_2 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp18_2);

        setTitle("Exp18_2");

    }

    public void dial(View view){

        intent=new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel: "+"9890280221"));
        startActivity(intent);
    }
}
