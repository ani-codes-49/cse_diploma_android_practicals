package com.e.exp;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp14_3 extends AppCompatActivity {

    GridView gridView;
    public String[] filename={"Button1","Button2","Button3"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp14_3);
        setTitle("Exp14_3");

        gridView=findViewById(R.id.gv1);
        gridView.setAdapter(new ButtonAdapter(this));

    }
}
