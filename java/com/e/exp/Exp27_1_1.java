    package com.e.exp;

    import android.os.Bundle;
    import android.widget.TextView;

    import androidx.annotation.Nullable;
    import androidx.appcompat.app.AppCompatActivity;

    public class Exp27_1_1 extends AppCompatActivity {

        TextView result;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.exp27_1_1);

            result=findViewById(R.id.result);
            result.setText(Exp27_1.getAns());

        }
    }
