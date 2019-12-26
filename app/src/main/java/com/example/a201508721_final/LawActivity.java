package com.example.a201508721_final;

import android.app.*;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.*;
import android.os.*;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class LawActivity extends TabActivity {
    Button btexitLaw;
    TextView tvTellaw, tvLawhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);

        TabHost tabHost = getTabHost();

        TabSpec tabSpecIntro = tabHost.newTabSpec("INTRO").setIndicator("학과소개");
        tabSpecIntro.setContent(R.id.tabIntro);
        tabHost.addTab(tabSpecIntro);

        TabSpec tabSpecProfessor = tabHost.newTabSpec("PROFESSOR").setIndicator("교수소개");
        tabSpecProfessor.setContent(R.id.tabProfessor);
        tabHost.addTab(tabSpecProfessor);

        TabSpec tabSpecSubject = tabHost.newTabSpec("SUBJECT").setIndicator("주요과목");
        tabSpecSubject.setContent(R.id.tabSubject);
        tabHost.addTab(tabSpecSubject);

        TabSpec tabSpecFuture = tabHost.newTabSpec("FUTURE").setIndicator("졸업 후 진로");
        tabSpecFuture.setContent(R.id.tabFuture);
        tabHost.addTab(tabSpecFuture);

        tabHost.setCurrentTab(0);

        tvTellaw = (TextView) findViewById(R.id.tvTellaw);
        tvLawhome = (TextView) findViewById(R.id.tvLawhome);
        btexitLaw = (Button) findViewById(R.id.btexitLaw);

        tvTellaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:024907475"));
                startActivity(myIntent);
            }
        });

        tvLawhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://hm.seoil.ac.kr/re"));
                startActivity(myIntent);
            }
        });

        btexitLaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
