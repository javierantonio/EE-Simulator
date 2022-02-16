package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Pag_3 extends AppCompatActivity {
    private Button vdstart,vdload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.pag_3);
        vdstart = (Button) findViewById(R.id.vdstart);
        vdstart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_7int();
            }});
        vdload = (Button) findViewById(R.id.vdload);
        vdload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }});


    };

    public void openpag_7int() {

        Intent intent = new Intent(this, Pag_7.class);
        startActivity(intent);
    }


    };


