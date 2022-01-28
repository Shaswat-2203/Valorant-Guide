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

public class Sova_ascent extends AppCompatActivity {

    myadapter adapter1,adapter2,adapter3,adapter4,adapter5,adapter6,adapter7,adapter8,adapter9,adapter10;

    RecyclerView recView1,recView2,recView3,recView4,recView5,recView6,recView7,recView8,recView9,recView10;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sova_ascent);
        img1=findViewById(R.id.video1);
        img2=findViewById(R.id.video2);
        img3=findViewById(R.id.video3);
        img4=findViewById(R.id.video4);
        img5=findViewById(R.id.video5);
        img6=findViewById(R.id.video6);
        img7=findViewById(R.id.video7);
        img8=findViewById(R.id.video8);
        img9=findViewById(R.id.video9);
        img10=findViewById(R.id.video10);
        find_recview1();
        find_recview2();
        find_recview3();
        find_recview4();
        find_recview5();
        find_recview6();
        find_recview7();
        find_recview8();
        find_recview9();
        find_recview10();
        show_video();
    }

    private void show_video() {
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fattackavideo.mp4?alt=media&token=e75d3a58-fe17-4690-b7ca-e4e6c28c0851").into(img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sova_ascent.this,Full_screen_video.class);
                intent.putExtra("video","https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fattackavideo.mp4?alt=media&token=e75d3a58-fe17-4690-b7ca-e4e6c28c0851");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fattackbvideo.mp4?alt=media&token=4f1dbdd7-6511-4f34-9f61-83f2ab09bca9").into(img2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sova_ascent.this,Full_screen_video.class);
                intent.putExtra("video","https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fattackbvideo.mp4?alt=media&token=4f1dbdd7-6511-4f34-9f61-83f2ab09bca9");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fdefendavideo.mp4?alt=media&token=053f9af6-8597-4eb4-ac5c-6f9b97d0671a").into(img3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sova_ascent.this,Full_screen_video.class);
                intent.putExtra("video","https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fdefendavideo.mp4?alt=media&token=053f9af6-8597-4eb4-ac5c-6f9b97d0671a");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fdefendbvideo.mp4?alt=media&token=a29ba432-b733-4ca0-a96b-94959be64cf6").into(img4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sova_ascent.this,Full_screen_video.class);
                intent.putExtra("video","https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fdefendbvideo.mp4?alt=media&token=a29ba432-b733-4ca0-a96b-94959be64cf6");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fpostplantavideo.mp4?alt=media&token=67885d36-cf09-41de-aa5c-5aca312bc202").into(img5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sova_ascent.this,Full_screen_video.class);
                intent.putExtra("video","https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fpostplantavideo.mp4?alt=media&token=67885d36-cf09-41de-aa5c-5aca312bc202");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fpostplantbvideo.mp4?alt=media&token=88294710-c4e5-483c-a6d6-d934f83ff568").into(img6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sova_ascent.this,Full_screen_video.class);
                intent.putExtra("video","https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fpostplantbvideo.mp4?alt=media&token=88294710-c4e5-483c-a6d6-d934f83ff568");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fpreplantavideo.mp4?alt=media&token=72afa16e-b416-44f6-9349-3e32766c5d79").into(img7);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sova_ascent.this,Full_screen_video.class);
                intent.putExtra("video","https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fpreplantavideo.mp4?alt=media&token=72afa16e-b416-44f6-9349-3e32766c5d79");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fpreplantbvideo.mp4?alt=media&token=358bb682-e7e7-42d1-8674-4db2e5c62ea8").into(img8);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sova_ascent.this,Full_screen_video.class);
                intent.putExtra("video","https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fpreplantbvideo.mp4?alt=media&token=358bb682-e7e7-42d1-8674-4db2e5c62ea8");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fretakeavideo.mp4?alt=media&token=06451daa-511f-4b59-be20-17ed04a09989").into(img9);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sova_ascent.this,Full_screen_video.class);
                intent.putExtra("video","https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fretakeavideo.mp4?alt=media&token=06451daa-511f-4b59-be20-17ed04a09989");
                startActivity(intent);
            }
        });
        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fretakebvideo.mp4?alt=media&token=a08b38bb-7969-43a7-91ae-649c6801f4c7").into(img10);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sova_ascent.this,Full_screen_video.class);
                intent.putExtra("video","https://firebasestorage.googleapis.com/v0/b/valorant-guide-8f156.appspot.com/o/Videos%2Fretakebvideo.mp4?alt=media&token=a08b38bb-7969-43a7-91ae-649c6801f4c7");
                startActivity(intent);
            }
        });
    }

    private void find_recview2() {
        recView2=findViewById(R.id.recview2);
        recView2.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_ascent.this,LinearLayoutManager.HORIZONTAL,false);
        recView2.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Ascent").child("attack_b"), model.class)
                        .build();
        adapter2=new myadapter(options);
        recView2.setAdapter(adapter2);
    }
    private void find_recview3() {
        recView3=findViewById(R.id.recview3);
        recView3.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_ascent.this,LinearLayoutManager.HORIZONTAL,false);
        recView3.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Ascent").child("defend_a"), model.class)
                        .build();
        adapter3=new myadapter(options);
        recView3.setAdapter(adapter3);
    }
    private void find_recview4() {
        recView4=findViewById(R.id.recview4);
        recView4.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_ascent.this,LinearLayoutManager.HORIZONTAL,false);
        recView4.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Ascent").child("defend_b"), model.class)
                        .build();

        adapter4=new myadapter(options);
        recView4.setAdapter(adapter4);
    }
    private void find_recview5() {
        recView5=findViewById(R.id.recview5);
        recView5.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_ascent.this,LinearLayoutManager.HORIZONTAL,false);
        recView5.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Ascent").child("postplant_a"), model.class)
                        .build();
        adapter5=new myadapter(options);
        recView5.setAdapter(adapter5);
    }
    private void find_recview6() {
        recView6=findViewById(R.id.recview6);
        recView6.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_ascent.this,LinearLayoutManager.HORIZONTAL,false);
        recView6.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Ascent").child("postplant_b"), model.class)
                        .build();
        adapter6=new myadapter(options);
        recView6.setAdapter(adapter6);
    }
    private void find_recview7() {
        recView7=findViewById(R.id.recview7);
        recView7.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_ascent.this,LinearLayoutManager.HORIZONTAL,false);
        recView7.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Ascent").child("preplant_a"), model.class)
                        .build();
        adapter7=new myadapter(options);
        recView7.setAdapter(adapter7);
    }
    private void find_recview8() {
        recView8=findViewById(R.id.recview8);
        recView8.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_ascent.this,LinearLayoutManager.HORIZONTAL,false);
        recView8.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Ascent").child("preplant_b"), model.class)
                        .build();
        adapter8=new myadapter(options);
        recView8.setAdapter(adapter8);
    }
    private void find_recview9() {
        recView9=findViewById(R.id.recview9);
        recView9.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_ascent.this,LinearLayoutManager.HORIZONTAL,false);
        recView9.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Ascent").child("retake_a"), model.class)
                        .build();
        adapter9=new myadapter(options);
        recView9.setAdapter(adapter9);
    }
    private void find_recview10() {
        recView10=findViewById(R.id.recview10);
        recView10.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_ascent.this,LinearLayoutManager.HORIZONTAL,false);
        recView10.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Ascent").child("retake_b"), model.class)
                        .build();
        adapter10=new myadapter(options);
        recView10.setAdapter(adapter10);
    }
    private void find_recview1() {
        recView1=findViewById(R.id.recview1);
        recView1.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(Sova_ascent.this,LinearLayoutManager.HORIZONTAL,false);
        recView1.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Sova").child("Ascent").child("attack_a"), model.class)
                        .build();
        adapter1=new myadapter(options);
        recView1.setAdapter(adapter1);
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
        adapter9.startListening();
        adapter10.startListening();
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
        adapter9.stopListening();
        adapter10.stopListening();
    }
}