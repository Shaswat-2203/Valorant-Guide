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

public class Sova_Split extends AppCompatActivity {

    private myadapter adapter1,adapter2,adapter3,adapter4,adapter5,adapter6,adapter7,adapter8;
    private RecyclerView recView1,recView2,recView3,recView4,recView5,recView6,recView7,recView8;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sova__split);
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
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_split_attacka.mp4?alt=media&token=14c389f7-8ebd-43ff-a3bc-0ac72810cbb2").into(img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_Split.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_split_attacka.mp4?alt=media&token=14c389f7-8ebd-43ff-a3bc-0ac72810cbb2");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_spilt_attackb.mp4?alt=media&token=997bcae4-9006-400c-828a-5e50870185d9").into(img2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_Split.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_spilt_attackb.mp4?alt=media&token=997bcae4-9006-400c-828a-5e50870185d9");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_spilt_defenda.mp4?alt=media&token=1188e8a5-42fe-4350-8591-93adaabe3d6f").into(img3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_Split.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_spilt_defenda.mp4?alt=media&token=1188e8a5-42fe-4350-8591-93adaabe3d6f");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_spilt_defenda_shockdart.mp4?alt=media&token=ecaccdcc-d3da-4766-934e-b4b1e26fb7f1").into(img4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_Split.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_spilt_defenda_shockdart.mp4?alt=media&token=ecaccdcc-d3da-4766-934e-b4b1e26fb7f1");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_spilt_defendb.mp4?alt=media&token=d53c10ec-d053-4d31-8e0c-9ab4e30a99d3").into(img5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_Split.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_spilt_defendb.mp4?alt=media&token=d53c10ec-d053-4d31-8e0c-9ab4e30a99d3");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_split_defendb_shockdart.mp4?alt=media&token=d226ad0a-c1bc-4b04-9a7d-51725491e999").into(img6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_Split.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_split_defendb_shockdart.mp4?alt=media&token=d226ad0a-c1bc-4b04-9a7d-51725491e999");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_split_postplanta.mp4?alt=media&token=daf990fc-0ad1-4144-a674-c2555a5215dd").into(img7);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_Split.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_split_postplanta.mp4?alt=media&token=daf990fc-0ad1-4144-a674-c2555a5215dd");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_split_postplantb.mp4?alt=media&token=51e3ef75-a28b-4793-a370-0a6e1eca4e07").into(img8);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sova_Split.this, Full_screen_video.class);
                intent.putExtra("video", "https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fsova_split_postplantb.mp4?alt=media&token=51e3ef75-a28b-4793-a370-0a6e1eca4e07");
                startActivity(intent);
            }
        });
    }
    private void find_recview1() {
        recView1=findViewById(R.id.recview1);
        recView1.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_Split.this,LinearLayoutManager.HORIZONTAL,false);
        recView1.setLayoutManager(layoutManager);

        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Split").child("attack_a"), model.class)
                        .build();
        adapter1=new myadapter(options);
        recView1.setAdapter(adapter1);

    }
    private void find_recview2() {
        recView2=findViewById(R.id.recview2);
        recView2.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_Split.this,LinearLayoutManager.HORIZONTAL,false);
        recView2.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Split").child("attack_b"), model.class)
                        .build();
        adapter2=new myadapter(options);
        recView2.setAdapter(adapter2);
    }
    private void find_recview3() {
        recView3=findViewById(R.id.recview3);
        recView3.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_Split.this,LinearLayoutManager.HORIZONTAL,false);
        recView3.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Split").child("defend_a"), model.class)
                        .build();
        adapter3=new myadapter(options);
        recView3.setAdapter(adapter3);
    }
    private void find_recview4() {
        recView4=findViewById(R.id.recview4);
        recView4.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_Split.this,LinearLayoutManager.HORIZONTAL,false);
        recView4.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Split").child("a_shockdart"), model.class)
                        .build();
        adapter4=new myadapter(options);
        recView4.setAdapter(adapter4);
    }
    private void find_recview5() {
        recView5=findViewById(R.id.recview5);
        recView5.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_Split.this,LinearLayoutManager.HORIZONTAL,false);
        recView5.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Split").child("defend_b"), model.class)
                        .build();
        adapter5=new myadapter(options);
        recView5.setAdapter(adapter5);
    }
    private void find_recview6() {
        recView6=findViewById(R.id.recview6);
        recView6.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_Split.this,LinearLayoutManager.HORIZONTAL,false);
        recView6.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Split").child("b_shockdart"), model.class)
                        .build();
        adapter6=new myadapter(options);
        recView6.setAdapter(adapter6);
    }
    private void find_recview7() {
        recView7=findViewById(R.id.recview7);
        recView7.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_Split.this,LinearLayoutManager.HORIZONTAL,false);
        recView7.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Split").child("postplant_a"), model.class)
                        .build();
        adapter7=new myadapter(options);
        recView7.setAdapter(adapter7);
    }
    private void find_recview8() {
        recView8=findViewById(R.id.recview8);
        recView8.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_Split.this,LinearLayoutManager.HORIZONTAL,false);
        recView8.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Split").child("postplant_b"), model.class)
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