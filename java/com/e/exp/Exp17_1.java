package com.e.exp;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp17_1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp17_1);
        setTitle("Exp17_1");

        Log.e("Tag","On Creation");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Tag", "Resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Tag","Stopped");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Tag","Restarted");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Tag","Paused");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Tag","Started");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Tag","Destroyed");
    }


}
