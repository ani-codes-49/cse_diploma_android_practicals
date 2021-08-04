package com.e.exp;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Exp25_1 extends AppCompatActivity {

    ListView listView;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;
    String[] options={"Clockwise/Anti Clockwise","Zoom in/out","Fade in/out"};
    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp25_1);
        setTitle("Exp25_1");

        imageView=findViewById(R.id.img);
        listView=findViewById(R.id.animations);
        arrayList=new ArrayList<String>();
        arrayList.addAll(Arrays.asList(options));
        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:

                        Animation animation= AnimationUtils.loadAnimation(Exp25_1.this,R.anim.rotate);
                        animation.setDuration(1000);
                        imageView.startAnimation(animation);
                        Toast.makeText(Exp25_1.this,"Clockwise/Anti ClockWise",Toast.LENGTH_SHORT).show();

                        break;

                    case 1:

                        Animation animation1= AnimationUtils.loadAnimation(Exp25_1.this,R.anim.zoomin);
                        animation1.setDuration(1000);
                        imageView.startAnimation(animation1);
                        Toast.makeText(Exp25_1.this,"ZoomIn/Out",Toast.LENGTH_SHORT).show();
                        imageView.setImageResource(R.mipmap.ic_launcher);


                        break;


                    case 2:

                        Animation animation2= AnimationUtils.loadAnimation(Exp25_1.this,R.anim.fadein);
                        animation2.setDuration(2000);
                        imageView.startAnimation(animation2);
                        Toast.makeText(Exp25_1.this,"FadeIn/Out",Toast.LENGTH_SHORT).show();
                        imageView.setImageResource(R.mipmap.ic_launcher);


                        break;

                }

            }
        });
    }


}
