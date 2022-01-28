package com.example.valorantguide;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.valorantguide.databinding.ActivityChooseAgentsBinding;

import java.util.ArrayList;

public class Choose_agents extends AppCompatActivity {

    RelativeLayout viper,sova,killjoy,cypher,kayo,brimstone;
    ImageView pay;
    String amt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_agents);

        viper=findViewById(R.id.viper);
        sova=findViewById(R.id.sova);
        killjoy=findViewById(R.id.killjoy);
        cypher=findViewById(R.id.cypher);
        kayo=findViewById(R.id.kayo);
        brimstone=findViewById(R.id.brimstone);
        pay=findViewById(R.id.pay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paymentUsingGooglePay();
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

        killjoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Killjoy.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);

            }
        });
        kayo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Choose_agents.this, Kayo.class);
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

    private void paymentUsingGooglePay() {
        String GOOGLE_PAY_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user";
        Uri uri=Uri.parse("upi://pay").buildUpon()
                .appendQueryParameter("pa","saswataghoshnit99@okhdfcbank")
                .appendQueryParameter("pn","Saswata Ghosh")
                .appendQueryParameter("tn","Payment just for Contributing")
                .appendQueryParameter("am", "10")
                .appendQueryParameter("cu", "INR")
                .build();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);
        intent.setPackage(GOOGLE_PAY_PACKAGE_NAME);
        try{
            startActivityForResult(intent,101);
        }
        catch(Exception e){
            Toast.makeText(this,"Google Pay app not found", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==101)
        {
            if (resultCode==RESULT_OK)
            {
                if(data!=null)
                {
                    String value=data.getStringExtra("response");
                    ArrayList<String> list=new ArrayList<>();
                    list.add(value);
                    getstatus(list.get(0));

                }
            }
            else
            {
                Toast.makeText(this,"Payment failed",Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void getstatus(String data) {
        boolean ispaymentcancel=false;
        boolean ispaymentsuccess=false;
        boolean paymentfailed=false;
        String value[]=data.split("&");
        for (int i=0;i<value.length;i++)
        {
            String checkstring[]=value[i].split("=");
            if (checkstring.length>=2)
            {
                if (checkstring[0].toCharArray().equals("status"))
                {
                    if (checkstring[1].equals("success"))
                    ispaymentsuccess=true;
                }
                else
                {
                    paymentfailed=true;
                }
            }
            else
            {
                ispaymentcancel=true;
            }
        }
        if (ispaymentsuccess)
            Toast.makeText(this,"Payment Successful",Toast.LENGTH_SHORT).show();
        else if(ispaymentcancel)
            Toast.makeText(this,"Payment Cancelled",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Payment Failed",Toast.LENGTH_SHORT).show();
    }
}