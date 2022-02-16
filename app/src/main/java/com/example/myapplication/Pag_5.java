package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Pag_5 extends AppCompatActivity {
    private Button afstart,afload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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