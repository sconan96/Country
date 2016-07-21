package com.example.android.country;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton tokorea = (ImageButton) findViewById(R.id.korea1);
        tokorea.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main1Activity.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageButton tochina = (ImageButton) findViewById(R.id.china1);
        tochina.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageButton tojapan = (ImageButton) findViewById(R.id.japan1);
        tojapan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Main3Activity.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageButton tousa = (ImageButton) findViewById(R.id.usa1);
        tousa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Main4Activity.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageButton tohongkong = (ImageButton) findViewById(R.id.hongkong1);
        tohongkong.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Main5Activity.class);
                startActivityForResult(intent, 0);
            }
        });


    }
}
