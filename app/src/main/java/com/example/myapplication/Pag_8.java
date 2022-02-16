package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Pag_8 extends AppCompatActivity {
    private Button sbsc,mdpsc,pbsc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pag_8);
        sbsc = (Button)  findViewById(R.id.sbsc);
        sbsc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_15();
            }});
        mdpsc = (Button) findViewById(R.id.mdpsc);
        mdpsc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_14();
            }});
        pbsc = (Button) findViewById(R.id.pbsc);
        pbsc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_13();
            }});

    };

    public void openpag_13() {

        Intent intent = new Intent(this, Pag_13.class);
        startActivity(intent);
    }
    public void openpag_14() {

        Intent intent = new Intent(this, Pag_14.class);
        startActivity(intent);
    }

    public void openpag_15() {

        Intent intent = new Intent(this, Pag_15.class);
        startActivity(intent);
    }};
