package com.example.valorantguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Jett extends AppCompatActivity {

    RelativeLayout ascent, haven, split, bind,icebox, breeze;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jett);
        ascent=findViewById(R.id.ascent);
        haven= findViewById(R.id.haven);
        split=findViewById(R.id.split);
        bind=findViewById(R.id.bind);
        icebox=findViewById(R.id.icebox);
        breeze=findViewById(R.id.breeze);
        ascent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jett.this, Jett_ascent.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);
            }
        });
        haven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        icebox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        breeze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}