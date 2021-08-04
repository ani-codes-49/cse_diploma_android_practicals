package com.e.exp;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Exp16_2 extends AppCompatActivity {


    Calendar calendar;
    int year,month,date,hour,min;
    EditText e1,e2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp16_2);
        setTitle("Exp16_2");

        e1=findViewById(R.id.editText2);
        e2=findViewById(R.id.editText3);
    }

    public void setDate(View view)
    {

        calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH);
        date=calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                e1.setText(dayOfMonth+"/"+(month+1)+"/"+year);

            }
        },year,month,date);
datePickerDialog.show();
    }

    public void setTime(View view)
    {

        Calendar c1=Calendar.getInstance();
        hour=c1.get(Calendar.HOUR_OF_DAY);
        min=c1.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {


                e2.setText(hourOfDay+":"+minute);
            }
        },hour,min,true);
timePickerDialog.show();
    }

}
