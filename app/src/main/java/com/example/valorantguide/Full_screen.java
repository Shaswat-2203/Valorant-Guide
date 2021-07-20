package com.example.valorantguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Full_screen extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        String image=getIntent().getStringExtra("image");
        imageView=findViewById(R.id.image3);
        Glide.with(this).load(image).into(imageView);
    }
}