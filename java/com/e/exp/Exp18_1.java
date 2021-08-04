package com.e.exp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp18_1 extends AppCompatActivity {

    EditText url;
    Intent intent;
    String link;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp18_1);
        setTitle("Exp18_1");

        url=findViewById(R.id.url);


    }

    public void navigate(View view){

        if(url.getText().toString().startsWith("https://www.")){

            intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url.getText().toString()));
            startActivity(intent);

        }
        else if(url.getText().toString().startsWith("www.")){

            link=url.getText().toString();
            link="https://"+link;
            intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(link));
            startActivity(intent);


        }

     else {

            link=url.getText().toString();
            link ="https://www." + link;
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(link));
            startActivity(intent);


        }
    }
}
