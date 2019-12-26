package com.example.a201508721_final;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button btSchoolsystem, btCheck, btcampus, btExMajor, btbus, btrecruit, btexit;
    TextView tvNmae4, tvAge4, tvMajor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Seoil University");

        btSchoolsystem = (Button) findViewById(R.id.btSchoolsystem);
        btCheck = (Button) findViewById(R.id.btCheck);
        btcampus = (Button) findViewById(R.id.btcampus);
        btExMajor = (Button) findViewById(R.id.btExMajor);
        btbus = (Button) findViewById(R.id.btbus);
        btrecruit = (Button) findViewById(R.id.btrecruit);
        btexit = (Button) findViewById(R.id.btexit);
        tvNmae4 = (TextView) findViewById(R.id.tvName4);
        tvAge4 = (TextView) findViewById(R.id.tvAge4);
        tvMajor4 = (TextView) findViewById(R.id.tvMajor4);

        Bundle intent = getIntent().getExtras();
        tvNmae4.setText(intent.getString("tvNmae4"));
        tvAge4.setText(intent.getString("tvAge4"));
        tvMajor4.setText(intent.getString("tvMajor4"));


        btSchoolsystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://stis.seoil.ac.kr/stis/m/index.jsp"));
                startActivity(myIntent);
            }
        });

        btCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://attend.seoil.ac.kr/forward/MN/MN/PU_MNMN01_E01.do"));
                startActivity(myIntent);
            }
        });

        btcampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(intent);
            }
        });

        btExMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MajorActivity.class);
                startActivity(intent);
            }
        });

        btbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BusActivity.class);
                startActivity(intent);
            }
        });

        btrecruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RecruitActivity.class);
                startActivity(intent);
            }
        });

        btexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
                builder.setMessage("처음 화면으로 가시겠습니까?");
                builder.setTitle("종료 알림창")
                        .setCancelable(false)
                        .setPositiveButton("네", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("아니오", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("알림창");
                alert.show();
            }
        });
    }
}
