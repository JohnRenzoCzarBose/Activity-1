package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bred,bblue,bgreen,breset,borange,bbrown;
    View bg_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bred = (Button)findViewById(R.id.btnRED);
        bblue = (Button)findViewById(R.id.btnBLUE);
        bgreen = (Button)findViewById(R.id.btnGREEN);
        borange = (Button)findViewById(R.id.btnORANGE);
        bbrown = (Button)findViewById(R.id.btnBROWN);
        breset = (Button)findViewById(R.id.btnReset);
        bg_view = this.getWindow().getDecorView();


        bred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bred.getText().equals("Red"))
                {
                    bg_view.setBackgroundResource(R.color.red);
                    Toast.makeText(MainActivity.this,"You have Successfully Changed the Color to Red",Toast.LENGTH_LONG).show();
                }
                 }
        });
        bblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bblue.getText().equals("Blue"))
                {
                    bg_view.setBackgroundResource(R.color.blue);
                    Toast.makeText(MainActivity.this,"You have Successfully Changed the Color to Blue",Toast.LENGTH_LONG).show();
                }
            }
        });

        bgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bgreen.getText().equals("Green"))
                {
                    bg_view.setBackgroundResource(R.color.green);
                    Toast.makeText(MainActivity.this,"You have Successfully Changed the Color to Green",Toast.LENGTH_LONG).show();
                }
            }
        });

        bbrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bbrown.getText().equals("Brown"))
                {
                    bg_view.setBackgroundResource(R.color.brown);
                    Toast.makeText(MainActivity.this,"You have Successfully Changed the Color to Brown",Toast.LENGTH_LONG).show();
                }
            }
        });


        borange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(borange.getText().equals("Orange"))
                {
                    bg_view.setBackgroundResource(R.color.orange);
                    Toast.makeText(MainActivity.this,"You have Successfully Changed the Color to Orange",Toast.LENGTH_LONG).show();
                }
            }
        });

        breset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(breset.getText().equals("Reset"))
                {
                    bg_view.setBackgroundResource(R.color.white);
                    Toast.makeText(MainActivity.this,"You have Changed the Color to Default",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}