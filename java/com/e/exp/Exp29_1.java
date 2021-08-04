package com.e.exp;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Exp29_1 extends AppCompatActivity {

    EditText phoneno,message;
    SmsManager smsManager;
    ArrayList numbers=new ArrayList<String>();
    ListView listView;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp29_1);

        setTitle("Exp29_1");

        phoneno = findViewById(R.id.number);
        message = findViewById(R.id.msg);

        listView = findViewById(R.id.messages);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, numbers);
        listView.setAdapter(arrayAdapter);

    }

    public void send(View view){

        smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(phoneno.getText().toString(),null,message.getText().toString(),null,null);
        Toast.makeText(this,"Message Sent Successfully",Toast.LENGTH_SHORT).show();

    }

    public void list(View view){

        startActivity(new Intent(Exp29_1.this,Exp29_1_1.class));

    }
}
