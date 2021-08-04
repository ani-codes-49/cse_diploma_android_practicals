package com.e.exp;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp26_1 extends AppCompatActivity {


    SQLiteDatabase database;
    EditText name,age;
    String nameHolde,ageHolder,Insertquerry;
    Cursor cursor;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp26_1);

        setTitle("Exp 26_1");

        name=findViewById(R.id.name);
        age=findViewById(R.id.age);



        database=openOrCreateDatabase("USER", Context.MODE_PRIVATE,null);
        database.execSQL("CREATE TABLE IF NOT EXISTS USER(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, name VARCHAR, age VARCHAR);");



    }

    public void insert(View view){


        new Insertasync().execute();


    }

    public void insert(){

        try {
            nameHolde = name.getText().toString();
            ageHolder = age.getText().toString();

            if (TextUtils.isEmpty(nameHolde) || TextUtils.isEmpty(ageHolder)) {

                Toast.makeText(this, "Fields Cannot be empty", Toast.LENGTH_SHORT).show();

            } else {

                Insertquerry = "INSERT INTO USER (name,age) VALUES ('" + nameHolde + "','" + ageHolder + "')";
                database.execSQL(Insertquerry);
                Toast.makeText(this, "Data inserted Successfully !", Toast.LENGTH_SHORT).show();


            }


        }
        catch (Exception e){

            e.printStackTrace();

        }

    }
    public void retrieve(View view) {

        new Getasync().execute();

    }

    class Insertasync extends AsyncTask {


        @Override
        protected Object doInBackground(Object[] objects) {

           for(int i=0;i<5;i++){

               try{

                   Thread.sleep(1000);

               }catch (InterruptedException e){

                   e.printStackTrace();
                   publishProgress(i);

               }

       }
            return null;
        }

        @Override
        protected void onProgressUpdate(Object[] values) {

            super.onProgressUpdate(values);

           int a;
           a= (int) values[0];
           progressDialog.setProgress(a);
        }

        @Override
        protected void onPreExecute() {


            progressDialog = new ProgressDialog(Exp26_1.this);
            progressDialog.setMax(100);
            progressDialog.setMessage("Inserting data please wait...");
            progressDialog.setTitle("Insert Data");
            progressDialog.show();
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Object o) {


            insert();

            progressDialog.dismiss();
            AlertDialog.Builder a=new AlertDialog.Builder(Exp26_1.this);
            a.setTitle("Insert Data");
            a.setMessage("Data inserted successfully");
            a.setPositiveButton("Okay",null);
            a.show();

            super.onPostExecute(o);
        }
    }

    class Getasync extends AsyncTask {


        @Override
        protected Object doInBackground(Object[] objects) {

            for(int i=0;i<5;i++){

                try{

                    Thread.sleep(1000);

                }catch (InterruptedException e){

                    e.printStackTrace();
                    publishProgress(i);

                }

            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Object[] values) {

            super.onProgressUpdate(values);

            int a;
            a= (int) values[0];
            progressDialog.setProgress(a);

        }

        @Override
        protected void onPreExecute() {


            progressDialog = new ProgressDialog(Exp26_1.this);
            progressDialog.setMax(100);
            progressDialog.setMessage("Searching for data");
            progressDialog.setTitle("Getting data");
            progressDialog.show();
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Object o) {

            try {

                cursor = database.rawQuery("SELECT * FROM USER", null);

                if (cursor.getCount() == 0) {

                    progressDialog.dismiss();
                    AlertDialog.Builder alert = new AlertDialog.Builder(Exp26_1.this);
                    alert.setTitle("Data not available");
                    alert.setMessage("Sorry there is no data available");
                    alert.setPositiveButton("Okay", null);
                    alert.show();


                } else {

                    progressDialog.dismiss();
                    AlertDialog.Builder alert = new AlertDialog.Builder(Exp26_1.this);
                    int len=cursor.getCount();

                    while (cursor.moveToNext()) {

                        for(int i=0;i<len;i++) {

                            //alert.setMessage(cursor.getString(i));
                            // Toast.makeText(Exp26_1.this,cursor.getString(i),Toast.LENGTH_SHORT).show();
                            alert.setMessage("Name==> " + cursor.getString(1) + "\n" + "Age==> " + cursor.getString(2));

                        }
                    }
                    alert.setTitle("Result");
                    alert.setPositiveButton("Okay", null);
                    alert.show();


                }
            }
            catch (Exception e){

                e.printStackTrace();

            }
            super.onPostExecute(o);
        }
    }
}
