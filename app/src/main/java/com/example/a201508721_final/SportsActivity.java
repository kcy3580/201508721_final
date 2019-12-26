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
public class SportsActivity extends TabActivity {
    Button btexitSp;
    TextView tvTelsp, tvSphome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

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

        tvTelsp = (TextView) findViewById(R.id.tvTelsp);
        tvSphome = (TextView) findViewById(R.id.tvSphome);
        btexitSp = (Button) findViewById(R.id.btexitSp);

        tvTelsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:024907543"));
                startActivity(myIntent);
            }
        });

        tvSphome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://hm.seoil.ac.kr/rec"));
                startActivity(myIntent);
            }
        });

        btexitSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
