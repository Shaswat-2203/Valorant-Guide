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

public class Sova_bind extends AppCompatActivity {

    private myadapter adapter1,adapter2,adapter3,adapter4,adapter5,adapter6;
    private RecyclerView recView1,recView2,recView3,recView4,recView5,recView6;
    ImageView img1,img2,img3,img4,img5,img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sova_bind);
        img1=findViewById(R.id.video1);
        img2=findViewById(R.id.video2);
        img3=findViewById(R.id.video3);
        img4=findViewById(R.id.video4);
        img5=findViewById(R.id.video5);
        img6=findViewById(R.id.video6);

        find_recview1();
        find_recview2();
        find_recview3();
        find_recview4();
        find_recview5();
        find_recview6();

        show_video();
    }
    private void show_video() {
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_attacka.mp4?alt=media&token=f9188353-300b-4bf6-8bfd-7033d6988934").into(img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_bind.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_attacka.mp4?alt=media&token=f9188353-300b-4bf6-8bfd-7033d6988934");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_attackb.mp4?alt=media&token=8599e7d2-635e-476a-bf8e-530931b713f0").into(img2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_bind.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_attackb.mp4?alt=media&token=8599e7d2-635e-476a-bf8e-530931b713f0");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_defenda.mp4?alt=media&token=0fdd016e-1bcd-49b6-9b34-318e229eaa63").into(img3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_bind.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_defenda.mp4?alt=media&token=0fdd016e-1bcd-49b6-9b34-318e229eaa63");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_defendb.mp4?alt=media&token=e045aa12-1757-4de3-9c67-17d33f17e860").into(img4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_bind.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_defendb.mp4?alt=media&token=e045aa12-1757-4de3-9c67-17d33f17e860");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_postplanta.mp4?alt=media&token=2e0199b5-ea2d-484a-bff1-c9182a493a9c").into(img5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_bind.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_postplanta.mp4?alt=media&token=2e0199b5-ea2d-484a-bff1-c9182a493a9c");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_postplantb.mp4?alt=media&token=8e2daea7-0d78-4a4c-92f8-49d8112258cc").into(img6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_bind.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_bind_postplantb.mp4?alt=media&token=8e2daea7-0d78-4a4c-92f8-49d8112258cc");
                startActivity(intent);
            }
        });

    }
    private void find_recview1() {
        recView1=findViewById(R.id.recview1);
        recView1.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_bind.this,LinearLayoutManager.HORIZONTAL,false);
        recView1.setLayoutManager(layoutManager);

        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Bind").child("attack_a"), model.class)
                        .build();
        adapter1=new myadapter(options);
        recView1.setAdapter(adapter1);

    }
    private void find_recview2() {
        recView2=findViewById(R.id.recview2);
        recView2.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_bind.this,LinearLayoutManager.HORIZONTAL,false);
        recView2.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Bind").child("attack_b"), model.class)
                        .build();
        adapter2=new myadapter(options);
        recView2.setAdapter(adapter2);
    }
    private void find_recview3() {
        recView3=findViewById(R.id.recview3);
        recView3.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_bind.this,LinearLayoutManager.HORIZONTAL,false);
        recView3.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Bind").child("defend_a"), model.class)
                        .build();
        adapter3=new myadapter(options);
        recView3.setAdapter(adapter3);
    }
    private void find_recview4() {
        recView4=findViewById(R.id.recview4);
        recView4.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_bind.this,LinearLayoutManager.HORIZONTAL,false);
        recView4.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Bind").child("defend_b"), model.class)
                        .build();
        adapter4=new myadapter(options);
        recView4.setAdapter(adapter4);
    }
    private void find_recview5() {
        recView5=findViewById(R.id.recview5);
        recView5.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_bind.this,LinearLayoutManager.HORIZONTAL,false);
        recView5.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Bind").child("postplant_a"), model.class)
                        .build();
        adapter5=new myadapter(options);
        recView5.setAdapter(adapter5);
    }
    private void find_recview6() {
        recView6=findViewById(R.id.recview6);
        recView6.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_bind.this,LinearLayoutManager.HORIZONTAL,false);
        recView6.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Bind").child("postplant_b"), model.class)
                        .build();
        adapter6=new myadapter(options);
        recView6.setAdapter(adapter6);
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

    }
}