package com.example.valorantguide;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Full_screen_video extends AppCompatActivity {

    private VideoView videoView;
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_video);
        String video=getIntent().getStringExtra("video");
        videoView=findViewById(R.id.videoshow);
        Uri uri=Uri.parse(video);
        videoView.setVideoURI(uri);
        mediaController=new MediaController(this);
        mediaController.setMediaPlayer(videoView);
        videoView.setMediaController(mediaController);
        videoView.requestFocus();
        videoView.start();
    }
}