package com.e.exp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] exps={"Exp4_1","Exp4_2","Exp5_1","Exp5_2","Exp6_1","Exp6_2","Exp6_extra","Exp7_1","Exp7_2","Exp8_2","Exp9_1","Exp9_2","Exp9_extra",
            "Exp10_1","Exp10_2","Exp11_1","Exp12_1","Exp13_1","Exp13_2","Exp14_1","Exp14_2","Exp14_3","Exp14_4","Exp15_1","Exp15_2","Exp16_1",
            "Exp16_2","Exp17_1","Exp18_1","Exp18_2","Exp18_3","Exp21_1","Exp22_1","Exp22_2","Exp23_1","Exp23_2","Exp24_1","Exp25_1","Exp26_1","Exp27_1",
            "Exp28_1","Exp29_1","Exp30_1","Exp31_1","MapsActivity","Youtube"};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.exps);
        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,exps);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:

                        startActivity(new Intent(getApplicationContext(),Exp4_1.class));
                        break;

                    case 1:

                        startActivity(new Intent(getApplicationContext(),Exp4_2.class));
                        break;

                    case 2:

                        startActivity(new Intent(getApplicationContext(),Exp5_1.class));
                        break;

                    case 3:


                        startActivity(new Intent(getApplicationContext(),Exp5_2.class));
                        break;

                    case 4:

                        startActivity(new Intent(getApplicationContext(),Exp6_1.class));
                        break;

                    case 5:

                        startActivity(new Intent(getApplicationContext(),Exp6_2.class));
                        break;

                    case 6:

                        startActivity(new Intent(getApplicationContext(),Exp6_extra.class));
                        break;

                    case 7:

                        startActivity(new Intent(getApplicationContext(),Exp7_1.class));
                        break;

                    case 8:

                        startActivity(new Intent(getApplicationContext(),Exp7_2.class));
                        break;

                    case 9:

                        startActivity(new Intent(getApplicationContext(),Exp8_2.class));
                        break;

                    case 10:

                        startActivity(new Intent(getApplicationContext(),Exp9_1.class));
                        break;

                    case 11:

                        startActivity(new Intent(getApplicationContext(),Exp9_2.class));
                        break;


                    case 12:

                        startActivity(new Intent(getApplicationContext(),Exp9_extra.class));
                        break;

                    case 13:

                        startActivity(new Intent(getApplicationContext(),Exp10_1.class));
                        break;

                    case 14:

                        startActivity(new Intent(getApplicationContext(),Exp10_2.class));
                        break;

                    case 15:

                        startActivity(new Intent(getApplicationContext(),Exp11_1.class));
                        break;


                    case 16:

                        startActivity(new Intent(getApplicationContext(),Exp12_1.class));
                        break;



                    case 17:

                        startActivity(new Intent(getApplicationContext(),Exp13_1.class));
                        break;

                    case 18:

                        startActivity(new Intent(getApplicationContext(),Exp13_2.class));
                        break;

                    case 19:

                        startActivity(new Intent(getApplicationContext(),Exp14_1.class));
                        break;

                    case 20:

                        startActivity(new Intent(getApplicationContext(),Exp14_2.class));
                        break;

                    case 21:

                        startActivity(new Intent(getApplicationContext(),Exp14_3.class));
                        break;

                    case 22:

                        startActivity(new Intent(getApplicationContext(),Exp14_4.class));
                        break;

                    case 23:

                        startActivity(new Intent(getApplicationContext(),Exp15_1.class));
                        break;

                    case 24:

                        startActivity(new Intent(getApplicationContext(),Exp15_2.class));
                        break;

                    case 25:

                        startActivity(new Intent(getApplicationContext(),Exp16_1.class));
                        break;

                    case 26:

                        startActivity(new Intent(getApplicationContext(),Exp16_2.class));
                        break;

                    case 27:

                        startActivity(new Intent(getApplicationContext(),Exp17_1.class));
                        break;

                    case 28:

                        startActivity(new Intent(getApplicationContext(),Exp18_1.class));
                        break;

                    case 29:

                        startActivity(new Intent(getApplicationContext(),Exp18_2.class));
                        break;

                    case 30:

                        startActivity(new Intent(getApplicationContext(),Exp18_3.class));
                        break;

                    case 31:

                        startActivity(new Intent(getApplicationContext(),Exp21_1.class));
                        break;

                    case 32:

                        startActivity(new Intent(getApplicationContext(),Exp22_1.class));
                        break;

                    case 33:

                        startActivity(new Intent(getApplicationContext(),Exp22_2.class));
                        break;

                    case 34:

                        startActivity(new Intent(getApplicationContext(),Exp23_1.class));
                        break;

                    case 35:

                        startActivity(new Intent(getApplicationContext(),Exp23_2.class));
                        break;

                    case 36:

                        startActivity(new Intent(getApplicationContext(),Exp24_1.class));
                        break;

                    case 37:

                        startActivity(new Intent(getApplicationContext(),Exp25_1.class));
                        break;


                    case 38:

                        startActivity(new Intent(getApplicationContext(),Exp26_1.class));
                        break;

                    case 39:

                        startActivity(new Intent(getApplicationContext(),Exp27_1.class));
                        break;

                    case 40:

                        startActivity(new Intent(getApplicationContext(),Exp28_1.class));
                        break;

                    case 41:

                        startActivity(new Intent(getApplicationContext(),Exp29_1.class));
                        break;

                    case 42:

                      startActivity(new Intent(getApplicationContext(),Exp30_1.class));
                      break;

                    case 43:

                        startActivity(new Intent(getApplicationContext(),Exp31_1.class));
                        break;

                    case 44:

                        startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                        break;

                    case 45:

                        startActivity(new Intent(getApplicationContext(),Youtube.class));
                        break;

                }
            }
        });

    }
}
