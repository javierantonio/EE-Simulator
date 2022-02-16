package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Pag_4 extends AppCompatActivity {
    private Button scstart,scload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pag_4);

        scstart = (Button) findViewById(R.id.scstart);
        scstart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_8();
            }});
        scload = (Button) findViewById(R.id.scload);
        scload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }});
    };


    public void openpag_8() {

        Intent intent = new Intent(this, Pag_8.class);
        startActivity(intent);
}};