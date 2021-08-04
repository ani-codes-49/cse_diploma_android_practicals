package com.e.exp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp28_1 extends AppCompatActivity {

    EditText uname,pass;
    Button log;
    final String username="LESP";
    final String password="Lesp@123";
    int count=0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp28_1);

        setTitle("Exp28_1");

        uname=findViewById(R.id.username);
        pass=findViewById(R.id.password);
        log=findViewById(R.id.login);

    }

    public void login(View view){


        if(uname.getText().toString().isEmpty()|| pass.getText().toString().isEmpty()){

            Toast.makeText(this,"Username or password should not be empty..",Toast.LENGTH_SHORT).show();


        }

        else if(uname.getText().toString().length()<4 || pass.getText().toString().length()<8){

            count++;
            Toast.makeText(this,"Length should not be less than 8 characters...",Toast.LENGTH_SHORT).show();


        }

        else if(!uname.getText().toString().equals(username) || !pass.getText().toString().equals(password)){

            count++;
             Toast.makeText(this,"Invalid Credentials...",Toast.LENGTH_SHORT).show();


        }



         if(uname.getText().toString().equals(username) || pass.getText().toString().equals(password)){

            count=0;
            Toast.makeText(this,"Login Successful....",Toast.LENGTH_SHORT).show();


        }
        if(count==5)
        {

            log.setEnabled(false);

        }


    }

}
