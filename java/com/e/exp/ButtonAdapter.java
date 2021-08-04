package com.e.exp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

class ButtonAdapter extends BaseAdapter {
    private Context context;

    public String[] buttonNames={"Button1","Button 2","Button 3","Button 4","Button 5","Button 6","Button 7","Button 8","Button 9","Button 10","Button 11","Button 12","Button 13","Button 14","Button 15"};

    public ButtonAdapter(Context c) {

        context=c;

    }


    @Override
    public int getCount() {
        return buttonNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

        @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Button btn;

        if(convertView==null){

            btn=new Button(context);
            btn.setLayoutParams(new GridView.LayoutParams(250,185));
            btn.setPadding(2,2,2,2);



        }

        else{

            btn=(Button) convertView;

        }
        btn.setText(buttonNames[position]);
        btn.setTextColor(Color.BLACK);
        btn.setId(position);

        return btn;
    }
}
