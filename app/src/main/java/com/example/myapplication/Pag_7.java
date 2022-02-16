package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Pag_7 extends AppCompatActivity {
    private Button sbvd,mdpvd,pbvd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pag_7int);
        sbvd = (Button)  findViewById(R.id.sbvd);
        sbvd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_12();
            }});
        mdpvd = (Button) findViewById(R.id.mdpvd);
        mdpvd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_11();
            }});
        pbvd = (Button) findViewById(R.id.pbvd);
        pbvd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_10();
            }});

    };

    public void openpag_12() {

        Intent intent = new Intent(this, Pag_12.class);
        startActivity(intent);
    }
    public void openpag_11() {

        Intent intent = new Intent(this, Pag_11.class);
        startActivity(intent);
    }

    public void openpag_10() {

        Intent intent = new Intent(this, Pag_10.class);
        startActivity(intent);
    }
};