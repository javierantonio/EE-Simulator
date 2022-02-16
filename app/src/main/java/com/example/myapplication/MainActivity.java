package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button afstart,afload;
private Button testButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();

        setContentView(R.layout.pag_5);

        afstart = (Button) findViewById(R.id.afstart);
        afstart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openpag_2();
            }});
        afload = (Button) findViewById(R.id.afload);
        afload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }});

    };

    public void openpag_2() {

        Intent intent = new Intent(this, Pag_2.class);
        startActivity(intent);
    }};

