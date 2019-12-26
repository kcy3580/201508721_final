package com.example.a201508721_final;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecruitActivity extends AppCompatActivity {
    Button btRecruit1, btRecruit2, btRecruit3, btRecruit4, btexit5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recruit);
        setTitle("취업정보");

        btRecruit1 = (Button) findViewById(R.id.btRecruit1);
        btRecruit2 = (Button) findViewById(R.id.btRecruit2);
        btRecruit3 = (Button) findViewById(R.id.btRecruit3);
        btRecruit4 = (Button) findViewById(R.id.btRecruit4);
        btexit5 = (Button) findViewById(R.id.btexit5);

        btRecruit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://hm.seoil.ac.kr/62/72/"));
                startActivity(myIntent);
            }
        });

        btRecruit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.saramin.co.kr/"));
                startActivity(myIntent);
            }
        });

        btRecruit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jobkorea.co.kr/"));
                startActivity(myIntent);
            }
        });

        btRecruit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.work.go.kr/"));
                startActivity(myIntent);
            }
        });



        btexit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
