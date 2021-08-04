package com.e.exp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;

public class Exp30_1 extends AppCompatActivity {

    EditText receiver,subj,msg;
    Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp30_1);


        receiver=findViewById(R.id.receipant);
        subj=findViewById(R.id.sub);
        msg=findViewById(R.id.msg);

    }

    public void send(View view){

        intent=new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");

        intent.putExtra(Intent.EXTRA_EMAIL,receiver.getText().toString());
        intent.putExtra(Intent.EXTRA_RESULT_RECEIVER,subj.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT,msg.getText().toString());

        startActivity(Intent.createChooser(intent,"Choose mail application"));

    }
}
