package com.example.valorantguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Choose_agents extends AppCompatActivity {

    RelativeLayout jett,viper,raze,omen,sova,killjoy,skye,breach,yoru,astra,cypher,reyna,phoenix,sage,brimstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_agents);
        jett=findViewById(R.id.jett);
        viper=findViewById(R.id.viper);
        raze=findViewById(R.id.raze);
        omen=findViewById(R.id.omen);
        sova=findViewById(R.id.sova);
        killjoy=findViewById(R.id.killjoy);
        skye=findViewById(R.id.skye);
        breach=findViewById(R.id.breach);
        yoru=findViewById(R.id.yoru);
        astra=findViewById(R.id.astra);
        cypher=findViewById(R.id.cypher);
        reyna=findViewById(R.id.reyna);
        phoenix=findViewById(R.id.phoenix);
        sage=findViewById(R.id.sage);
        brimstone=findViewById(R.id.brimstone);

        jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Jett.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        viper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Viper.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        raze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Raze.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        phoenix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Phoenix.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        reyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Reyna.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        sova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Sova.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        brimstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Brimstone.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        omen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Omen.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        yoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Yoru.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);
            }
        });
        killjoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Killjoy.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        sage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Sage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        astra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Astra.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        skye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Skye.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        breach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Breach.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        cypher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Cypher.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
    }
}