package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Pag_6 extends AppCompatActivity {
    private Button pfstart,pfload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pag_6);
        pfstart = (Button) findViewById(R.id.pfstart);
        pfstart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_6();
            }});
        pfload = (Button) findViewById(R.id.pfload);
       pfload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }});

    };

    public void openpag_6() {

        Intent intent = new Intent(this, Pag_6.class);
        startActivity(intent);
    }
};