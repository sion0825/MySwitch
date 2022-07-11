package com.example.myswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Switch switch1;
ImageView img_view;
LinearLayout layout_1;
Button btn_exit,btn_begin;
RadioButton radio_button1,radio_button2,radio_button3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        switch1 =findViewById(R.id.switch1);
        img_view =findViewById(R.id.img_view);
        layout_1 =findViewById(R.id.layout_1);
        switch1 = findViewById(R.id.switch1);
        radio_button1=findViewById(R.id.radio_button1);
        radio_button2=findViewById(R.id.radio_button2);
        radio_button3=findViewById(R.id.radio_button3);
        btn_exit=findViewById(R.id.btn_exit);
        btn_begin=findViewById(R.id.btn_begin);
        switch1.setOnClickListener(this);
        radio_button1.setOnClickListener(this);
        radio_button2.setOnClickListener(this);
        radio_button3.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
        btn_begin.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.switch1:
                if(switch1.isChecked())
                    layout_1.setVisibility(View.VISIBLE);
                else
                    layout_1.setVisibility(View.INVISIBLE);
                break;
            case R.id.radio_button1:
                img_view.setImageResource(R.drawable.an8);
                break;
            case R.id.radio_button2:
                img_view.setImageResource(R.drawable.an9);
                break;
            case R.id.radio_button3:
                img_view.setImageResource(R.drawable.an10);
                break;
            case R.id.btn_begin:
                    switch1.performClick();
                break;
            case R.id.btn_exit:
                finish();
        }
    }
}