package com.e.exp;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Exp29_1_1 extends AppCompatActivity {

    ListView listView;
    ArrayList numbers=new ArrayList<String>();
    ContentResolver contentResolver;
    Cursor cursor;
    Button button;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp29_1_1);

        listView=findViewById(R.id.lst);

        button=findViewById(R.id.btn);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, numbers);
        listView.setAdapter(arrayAdapter);


        try{

            contentResolver=getContentResolver();
            cursor =contentResolver.query((Uri.parse("content://sms/inbox")),null,null,null,null);

            int indexBody=cursor.getColumnIndex("Body");
            int indexAddress=cursor.getColumnIndex("Address");


            if (indexBody < 0 || !cursor.moveToFirst())
                return;
            arrayAdapter.clear();

            do {

                String str = "SMS From: " + cursor.getString(indexAddress) + "\n" + cursor.getString(indexBody) + "\n";
                arrayAdapter.add(str);

            } while (cursor.moveToNext());



        }
        catch (Exception e){

            e.printStackTrace();

        }

    }


}
