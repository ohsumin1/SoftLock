package com.kosmo.softlock;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

public class End_item extends LinearLayout {

    TextView hp_type;
    TextView hp_name;
    TextView restime;
    TextView resv_date;
    TextView resv_time;
    Button write;



    public End_item(Context context){
        super(context);

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_end_item, this, true);

        hp_type = (TextView)findViewById(R.id.hp_type);
        hp_name = (TextView) findViewById(R.id.hp_name);
        restime = (TextView) findViewById(R.id.restime);
        resv_date = (TextView) findViewById(R.id.resv_date);
        resv_time = (TextView) findViewById(R.id.resv_time);
        write = (Button)findViewById(R.id.write);


    }

    public void setHpType(String text){
        hp_type.setText(text);
    }
    public void setHpName(String text){
        hp_name.setText(text);
    }
    public void setResv_date(String text){
        resv_date.setText(text);
    }
    public void setResv_time(String text){
        resv_time.setText(text);
    }


}