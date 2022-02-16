package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Pag_2 extends AppCompatActivity {
    private ImageView vd,pf,sc,af;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();


        setContentView(R.layout.pag_2);

        vd = (ImageView) findViewById(R.id.vd);
        vd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_7();
            }});

        pf = (ImageView) findViewById(R.id.pf);
        pf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_18();
            }});

        sc = (ImageView) findViewById(R.id.sc);
        sc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_8();
            }});

        af= (ImageView) findViewById(R.id.af);
        af.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_9();
            }});



    }



    public void openpag_7(){

        Intent intent = new Intent(this,Pag_7.class);
        startActivity(intent);
    }
    public void openpag_8() {

        Intent intent = new Intent(this, Pag_8.class);
        startActivity(intent);
    }

    public void openpag_9() {

        Intent intent = new Intent(this, Pag_9.class);
        startActivity(intent);
    }

    public void openpag_18() {

        Intent intent = new Intent(this, Pag_18.class);
        startActivity(intent);
    }








};
