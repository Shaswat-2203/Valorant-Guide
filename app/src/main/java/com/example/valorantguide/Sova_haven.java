package com.example.valorantguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Sova_haven extends AppCompatActivity {

    private myadapter adapter1,adapter2,adapter3,adapter4,adapter5,adapter6,adapter7,adapter8;
    private RecyclerView recView1,recView2,recView3,recView4,recView5,recView6,recView7,recView8;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sova_haven);
        img1=findViewById(R.id.video1);
        img2=findViewById(R.id.video2);
        img3=findViewById(R.id.video3);
        img4=findViewById(R.id.video4);
        img5=findViewById(R.id.video5);
        img6=findViewById(R.id.video6);
        img7=findViewById(R.id.video7);
        img8=findViewById(R.id.video8);
        find_recview1();
        find_recview2();
        find_recview3();
        find_recview4();
        find_recview5();
        find_recview6();
        find_recview7();
        find_recview8();
        show_video();
    }
    private void show_video() {
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_attacka.mp4?alt=media&token=61bf45b7-da65-4552-a051-1d2259624952").into(img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_haven.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_attacka.mp4?alt=media&token=61bf45b7-da65-4552-a051-1d2259624952");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_attackc.mp4?alt=media&token=9b4ec83d-f160-4c34-b47a-5772ab68622a").into(img3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_haven.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_attackc.mp4?alt=media&token=9b4ec83d-f160-4c34-b47a-5772ab68622a");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_attackgarage.mp4?alt=media&token=2431013e-1e11-456a-b46d-42024d3a0f90").into(img2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_haven.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_attackgarage.mp4?alt=media&token=2431013e-1e11-456a-b46d-42024d3a0f90");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_defendab.mp4?alt=media&token=f2203a52-bcf8-40fe-90ae-e4f375ab5484").into(img4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_haven.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_defendab.mp4?alt=media&token=f2203a52-bcf8-40fe-90ae-e4f375ab5484");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_defendc.mp4?alt=media&token=10d5d3bb-a013-4dd7-bb3a-dd82bdb2a666").into(img5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_haven.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_defendc.mp4?alt=media&token=10d5d3bb-a013-4dd7-bb3a-dd82bdb2a666");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_postplanta.mp4?alt=media&token=e6cf156b-d341-45f2-a64d-510a7b013a4a").into(img6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_haven.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_postplanta.mp4?alt=media&token=e6cf156b-d341-45f2-a64d-510a7b013a4a");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_postplantc.mp4?alt=media&token=021a6e8e-4cd9-4b3e-abca-5be9f09da7dd").into(img7);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_haven.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_postplantc.mp4?alt=media&token=021a6e8e-4cd9-4b3e-abca-5be9f09da7dd");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_retakea.mp4?alt=media&token=78027969-9d4e-4731-8026-c702ee0e2dbc").into(img8);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_haven.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_haven_retakea.mp4?alt=media&token=78027969-9d4e-4731-8026-c702ee0e2dbc");
                startActivity(intent);
            }
        });
    }
    private void find_recview1() {
        recView1=findViewById(R.id.recview1);
        recView1.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_haven.this,LinearLayoutManager.HORIZONTAL,false);
        recView1.setLayoutManager(layoutManager);
        
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Haven").child("attack_a"), model.class)
                        .build();
        adapter1=new myadapter(options);
        recView1.setAdapter(adapter1);

    }
    private void find_recview2() {
        recView2=findViewById(R.id.recview2);
        recView2.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_haven.this,LinearLayoutManager.HORIZONTAL,false);
        recView2.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Haven").child("attack_garage"), model.class)
                        .build();
        adapter2=new myadapter(options);
        recView2.setAdapter(adapter2);
    }
    private void find_recview3() {
        recView3=findViewById(R.id.recview3);
        recView3.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_haven.this,LinearLayoutManager.HORIZONTAL,false);
        recView3.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Haven").child("attack_c"), model.class)
                        .build();
        adapter3=new myadapter(options);
        recView3.setAdapter(adapter3);
    }
    private void find_recview4() {
        recView4=findViewById(R.id.recview4);
        recView4.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_haven.this,LinearLayoutManager.HORIZONTAL,false);
        recView4.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Haven").child("defend_ab"), model.class)
                        .build();
        adapter4=new myadapter(options);
        recView4.setAdapter(adapter4);
    }
    private void find_recview5() {
        recView5=findViewById(R.id.recview5);
        recView5.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_haven.this,LinearLayoutManager.HORIZONTAL,false);
        recView5.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Haven").child("defend_c"), model.class)
                        .build();
        adapter5=new myadapter(options);
        recView5.setAdapter(adapter5);
    }
    private void find_recview6() {
        recView6=findViewById(R.id.recview6);
        recView6.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_haven.this,LinearLayoutManager.HORIZONTAL,false);
        recView6.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Haven").child("postplant_a"), model.class)
                        .build();
        adapter6=new myadapter(options);
        recView6.setAdapter(adapter6);
    }
    private void find_recview7() {
        recView7=findViewById(R.id.recview7);
        recView7.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_haven.this,LinearLayoutManager.HORIZONTAL,false);
        recView7.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Haven").child("postplant_c"), model.class)
                        .build();
        adapter7=new myadapter(options);
        recView7.setAdapter(adapter7);
    }
    private void find_recview8() {
        recView8=findViewById(R.id.recview8);
        recView8.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_haven.this,LinearLayoutManager.HORIZONTAL,false);
        recView8.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Haven").child("retake_a"), model.class)
                        .build();
        adapter8=new myadapter(options);
        recView8.setAdapter(adapter8);
    }
    @Override
    protected void onStart() {
        super.onStart();
        adapter1.startListening();
        adapter2.startListening();
        adapter3.startListening();
        adapter4.startListening();
        adapter5.startListening();
        adapter6.startListening();
        adapter7.startListening();
        adapter8.startListening();

    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter1.stopListening();
        adapter2.stopListening();
        adapter3.stopListening();
        adapter4.stopListening();
        adapter5.stopListening();
        adapter6.stopListening();
        adapter7.stopListening();
        adapter8.stopListening();

    }
}