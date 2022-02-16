package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Pag_9 extends AppCompatActivity {
    private Button iiee,nfpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pag_9);
        nfpa = (Button) findViewById(R.id.nfpa);
        nfpa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_16();
            }});
      iiee= (Button) findViewById(R.id.iiee);
       iiee.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_17();
            }});

    };

    public void openpag_16() {

        Intent intent = new Intent(this, Pag_16.class);
        startActivity(intent);
    }
    public void openpag_17() {

        Intent intent = new Intent(this, Pag_17.class);
        startActivity(intent);
    }
};