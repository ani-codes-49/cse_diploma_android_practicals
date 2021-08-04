package com.e.exp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Exp23_2 extends AppCompatActivity {

    VideoView videoView;
    MediaController mediaController;
    static final int req=1;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp23_2);
        setTitle("Exp23_2");

     /*   videoView = findViewById(R.id.vdo);

        mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abc));

        videoView.start();

        */


        intent=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);

        if(intent.resolveActivity(getPackageManager())!=null){

            startActivityForResult(intent,req);

        }
    }

}
