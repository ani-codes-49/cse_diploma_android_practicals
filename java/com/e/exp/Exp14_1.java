    package com.e.exp;

    import android.os.Bundle;
    import android.view.View;
    import android.widget.AdapterView;
    import android.widget.ArrayAdapter;
    import android.widget.ListView;
    import android.widget.TextView;
    import android.widget.Toast;

    import androidx.annotation.Nullable;
    import androidx.appcompat.app.AppCompatActivity;

    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.Iterator;

    public class Exp14_1 extends AppCompatActivity {

        ArrayList arrayList;
        ArrayAdapter arrayAdapter;
        ListView listView;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.exp14_1);
            setTitle("Exp14_1");

            listView=findViewById(R.id.list);


            arrayList=new ArrayList<String>();
            arrayList.add("Android");
            arrayList.add("Java");
            arrayList.add("PHP");
            arrayList.add("Hadoop");
            arrayList.add("Python");
            arrayList.add("Sap");
            arrayList.add("Ajax");
            arrayList.add("C++");
            arrayList.add("Ruby");
            arrayList.add("Rails");
            arrayList.add("C");
            arrayList.add("React.js");
            arrayList.add("Swift");


            arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
            listView.setAdapter(arrayAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Toast.makeText(Exp14_1.this,((TextView)view).getText().toString(),Toast.LENGTH_SHORT).show();

                }
            });

        }



    }
