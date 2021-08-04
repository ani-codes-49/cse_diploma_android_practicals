package com.e.exp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp27_1 extends AppCompatActivity {

    EditText uname,pass;
    final String username="LESP";
    final String password="Lesp@123";
    static String res="";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp27_1);

        setTitle("Exp27_1");

        uname=findViewById(R.id.username);
        pass=findViewById(R.id.password);

    }

    public void login(View view){


        if(uname.getText().toString().isEmpty() || pass.getText().toString().isEmpty()){

           res="Username or password should not be empty..";
           startActivity(new Intent(this,Exp27_1_1.class));

        }


        else if(!uname.getText().toString().equals(username) || !pass.getText().toString().equals(password)){

           res= "Login Unsuccessful !";
            startActivity(new Intent(this,Exp27_1_1.class));



        }

        else if(uname.getText().toString().equals(username) || pass.getText().toString().equals(password)){

            res="Login Successful....";
            startActivity(new Intent(this,Exp27_1_1.class));

        }
    }

    public static String getAns(){

        return res;

    }

}
