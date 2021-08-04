package com.e.exp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp23_1 extends AppCompatActivity {

    Bitmap photo;
    Intent intent;
    static final int camera_re=1;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp23_1);
        setTitle("Exp23_1");

        imageView=findViewById(R.id.display);
        imageView.setVisibility(View.INVISIBLE);
        textView=findViewById(R.id.img);

    }

    public void cap(View view){

        intent=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);

        if(intent.resolveActivity(getPackageManager())!=null){

            startActivityForResult(intent,camera_re);

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {



        if (requestCode == camera_re && resultCode == RESULT_OK) {

            photo = (Bitmap) data.getExtras().get("data");

            textView.setVisibility(View.INVISIBLE);
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageBitmap(photo);

        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
