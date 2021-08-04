package com.e.exp;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exp11_1 extends AppCompatActivity {

    CheckBox ch1,ch2,ch3,ch4,ch5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp11_1);
        setTitle("Exp11_1");

    }

  public void check(View view) {

      ch1 = findViewById(R.id.mad);
      ch2 = findViewById(R.id.pwp);
      ch3 = findViewById(R.id.nis);
      ch4 = findViewById(R.id.cpe);
      ch5 = findViewById(R.id.ede);

      StringBuilder res = new StringBuilder();
      res.append("");
      if (ch1.isChecked()) {
          res.append(" Android");
      }
      if (ch2.isChecked()) {
          res.append(" Python");
      }
      if (ch3.isChecked()) {
          res.append(" Network");
      }
      if (ch4.isChecked()) {
          res.append(" Project Planning");
      }
      if (ch5.isChecked()) {
          res.append(" Entreprenuership Development");
      }
      else if (res.toString().isEmpty()) {
          res.append("Select Something...");
      }
          Toast.makeText(this, "Selected Subjects : " + res.toString(), Toast.LENGTH_LONG).show();

  }
}
