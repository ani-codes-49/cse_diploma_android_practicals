package com.e.exp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class Exp13_2 extends AppCompatActivity {

    int status=0;
    Handler handler=new Handler();

    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp13_2);
        setTitle("Exp13_2");
    }

    public void down(View view){

            final ProgressDialog process = new ProgressDialog(this);
            process.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            process.setMessage("Your File is Downloading....");
            process.setProgress(0);
            process.setMax(100);
            process.show();

            new Thread(new Runnable() {
                @Override
                public void run() {

                    while (process.getProgress() < 100) {

                        process.setProgress(status);
                        status += 1;

                        try {

                            Thread.sleep(500);

                        } catch (InterruptedException e) {

                            e.printStackTrace();

                        }

                        handler.post(new Runnable() {
                            @Override
                            public void run() {

                                process.setProgress(status);
                                if (status == 100) {
                                    process.dismiss();

                                }
                            }
                        });
                    }
                }
            }).start();
        }
    }

