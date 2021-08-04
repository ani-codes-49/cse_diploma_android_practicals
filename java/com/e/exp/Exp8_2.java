package com.e.exp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Exp8_2 extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;
    String[] subs={"22032 - Entrepreneurship Development","22060 - Capstone Project Execution","22509 - Management","22616 - Programming with Python"

            ,"22617 - Mobile Application Development","22618 - Emerging  Trends in Computer Engg","22619 -  Web Based Application development with PHP"

    ,"22620 - Network and Information Security","22621 - Data Warehousing and Mining Techniques"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp8_2);

        setTitle("Exp8_2");

        autoCompleteTextView=findViewById(R.id.auto);
        autoCompleteTextView.setDropDownWidth(1000);
        arrayList=new ArrayList<String>();

        arrayList.addAll(Arrays.asList(subs));
        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,subs);
        autoCompleteTextView.setAdapter(arrayAdapter);
    }
}
