package com.e.exp;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp13_1 extends AppCompatActivity {

    ProgressBar pb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp13_1);
        setTitle("Exp13_1");

        pb=findViewById(R.id.progressBar);

    }

    public void setp(View view)
    {

        pb.setVisibility(View.VISIBLE);

    }
    public void setc(View view)
    {

        pb.setVisibility(View.INVISIBLE);

    }

}
