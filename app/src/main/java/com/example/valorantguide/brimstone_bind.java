package com.example.valorantguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class brimstone_bind extends AppCompatActivity {

    myadapter adapter1,adapter2,adapter3,adapter4;

    RecyclerView recView1,recView2,recView3,recView4;
    ImageView img1,img2,img3,img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brimstone_ascent);
        img1=findViewById(R.id.video1);
        img2=findViewById(R.id.video2);
        img3=findViewById(R.id.video3);
        img4=findViewById(R.id.video4);
        find_recview1();
        find_recview2();
        find_recview3();
        find_recview4();
        show_video();
    }
    private void show_video() {
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fbrimstone_bind_smokea.mp4?alt=media&token=2a4f1a9e-ec4e-4eb7-91d0-d56097872fa7").into(img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(brimstone_bind.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fbrimstone_bind_smokea.mp4?alt=media&token=2a4f1a9e-ec4e-4eb7-91d0-d56097872fa7");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fbrimstone_bind_smokeb.mp4?alt=media&token=9f22372c-d05b-4526-8723-608a7fc55fe9").into(img2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(brimstone_bind.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fbrimstone_bind_smokeb.mp4?alt=media&token=9f22372c-d05b-4526-8723-608a7fc55fe9");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fbrimstone_bind_postplanta.mp4?alt=media&token=c8a25a2d-0fbf-4f90-84e3-8ea9a874590f").into(img3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(brimstone_bind.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fbrimstone_bind_postplanta.mp4?alt=media&token=c8a25a2d-0fbf-4f90-84e3-8ea9a874590f");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fbrimstone_bind_postplantb.mp4?alt=media&token=d207fa8e-4509-48f8-934e-ef76d2178b83").into(img4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(brimstone_bind.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fbrimstone_bind_postplantb.mp4?alt=media&token=d207fa8e-4509-48f8-934e-ef76d2178b83");
                startActivity(intent);
            }
        });
    }
    private void find_recview1() {
        recView1=findViewById(R.id.recview1);
        recView1.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(brimstone_bind.this,LinearLayoutManager.HORIZONTAL,false);
        recView1.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Brimstone").child("Bind").child("smoke_a"), model.class)
                        .build();
        adapter1=new myadapter(options);
        recView1.setAdapter(adapter1);
    }
    private void find_recview2() {
        recView2=findViewById(R.id.recview2);
        recView2.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(brimstone_bind.this,LinearLayoutManager.HORIZONTAL,false);
        recView2.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Brimstone").child("Bind").child("smoke_b"), model.class)
                        .build();
        adapter2=new myadapter(options);
        recView2.setAdapter(adapter2);
    }
    private void find_recview3() {
        recView3=findViewById(R.id.recview3);
        recView3.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(brimstone_bind.this,LinearLayoutManager.HORIZONTAL,false);
        recView3.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Brimstone").child("Bind").child("postplant_a"), model.class)
                        .build();
        adapter3=new myadapter(options);
        recView3.setAdapter(adapter3);
    }
    private void find_recview4() {
        recView4=findViewById(R.id.recview4);
        recView4.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(brimstone_bind.this,LinearLayoutManager.HORIZONTAL,false);
        recView4.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Brimstone").child("Bind").child("postplant_b"), model.class)
                        .build();

        adapter4=new myadapter(options);
        recView4.setAdapter(adapter4);
    }
    @Override
    protected void onStart() {
        super.onStart();
        adapter1.startListening();
        adapter2.startListening();
        adapter3.startListening();
        adapter4.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter1.stopListening();
        adapter2.stopListening();
        adapter3.stopListening();
        adapter4.stopListening();

    }
}