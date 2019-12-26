package com.example.a201508721_final;

import android.app.*;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import android.os.*;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MajorActivity extends TabActivity {
    Button btexit3;
    Button btComputer, btElectronic, btTele, btSoft, btBuild, btChemi, btGround, btCar, btSanup, btNurse, btFood;
    Button btChildedu, btLaw, btCulture, btEng, btJap, btChi, btMedia, btSociety, btSemu, btMovie, btFashion, btFdesign, btIndesign, btCommu, btSports, btVmd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);

        TabHost tabHost = getTabHost();

        TabSpec tabSpecIt = tabHost.newTabSpec("IT").setIndicator("공학");
        tabSpecIt.setContent(R.id.tabIt);
        tabHost.addTab(tabSpecIt);

        TabSpec tabSpecScience = tabHost.newTabSpec("SCIENCE").setIndicator("자연");
        tabSpecScience.setContent(R.id.tabScience);
        tabHost.addTab(tabSpecScience);

        TabSpec tabSpecHuman = tabHost.newTabSpec("HUMAN").setIndicator("인문");
        tabSpecHuman.setContent(R.id.tabHuman);
        tabHost.addTab(tabSpecHuman);

        TabSpec tabSpecActivity = tabHost.newTabSpec("ACTIVITY").setIndicator("예체능");
        tabSpecActivity.setContent(R.id.tabActivity);
        tabHost.addTab(tabSpecActivity);

        tabHost.setCurrentTab(0);

        btComputer = (Button) findViewById(R.id.btComputer);
        btElectronic = (Button) findViewById(R.id.btElectronic);
        btTele = (Button) findViewById(R.id.btTele);
        btSoft = (Button) findViewById(R.id.btSoft);
        btBuild  = (Button) findViewById(R.id.btBuild);
        btChemi = (Button) findViewById(R.id.btChemi);
        btGround  = (Button) findViewById(R.id.btGround);
        btCar = (Button) findViewById(R.id.btCar);
        btSanup  = (Button) findViewById(R.id.btSanup);
        btNurse  = (Button) findViewById(R.id.btNurse);
        btFood = (Button) findViewById(R.id.btFood);
        btChildedu = (Button) findViewById(R.id.btChildedu);
        btLaw = (Button) findViewById(R.id.btLaw);
        btCulture = (Button) findViewById(R.id.btCulture);
        btEng = (Button) findViewById(R.id.btEng);
        btJap = (Button) findViewById(R.id.btJap);
        btChi = (Button) findViewById(R.id.btChi);
        btMedia = (Button) findViewById(R.id.btMedia);
        btSociety = (Button) findViewById(R.id.btSociety);
        btSemu = (Button) findViewById(R.id.btSemu);
        btMovie = (Button) findViewById(R.id.btMovie);
        btFashion = (Button) findViewById(R.id.btFashion);
        btFdesign = (Button) findViewById(R.id.btFdesign);
        btIndesign = (Button) findViewById(R.id.btIndesign);
        btCommu = (Button) findViewById(R.id.btCommu);
        btSports = (Button) findViewById(R.id.btSports);
        btVmd = (Button) findViewById(R.id.btVmd);
        btexit3 = (Button) findViewById(R.id.btexit3);

        btComputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ComputerActivity.class);
                startActivity(intent);
            }
        });

        btElectronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ElectronicActivity.class);
                startActivity(intent);
            }
        });

        btTele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TeleActivity.class);
                startActivity(intent);
            }
        });

        btSoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SoftActivity.class);
                startActivity(intent);
            }
        });

        btBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BuildActivity.class);
                startActivity(intent);
            }
        });

        btChemi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChemiActivity.class);
                startActivity(intent);
            }
        });

        btGround.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GroundActivity.class);
                startActivity(intent);
            }
        });

        btCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CarActivity.class);
                startActivity(intent);
            }
        });

        btSanup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SanupActivity.class);
                startActivity(intent);
            }
        });

        btNurse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NurseActivity.class);
                startActivity(intent);
            }
        });

        btFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FoodActivity.class);
                startActivity(intent);
            }
        });

        btChildedu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChieduActivity.class);
                startActivity(intent);
            }
        });

        btLaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LawActivity.class);
                startActivity(intent);
            }
        });

        btCulture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CultureActivity.class);
                startActivity(intent);
            }
        });

        btEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EngActivity.class);
                startActivity(intent);
            }
        });

        btJap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), JapActivity.class);
                startActivity(intent);
            }
        });

        btChi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChiActivity.class);
                startActivity(intent);
            }
        });

        btMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MediaActivity.class);
                startActivity(intent);
            }
        });

        btSociety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SocietyActivity.class);
                startActivity(intent);
            }
        });

        btSemu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SemuActivity.class);
                startActivity(intent);
            }
        });

        btMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MovieActivity.class);
                startActivity(intent);
            }
        });

        btFashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FashionActivity.class);
                startActivity(intent);
            }
        });

        btFdesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FdesignActivity.class);
                startActivity(intent);
            }
        });

        btIndesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IndesignActivity.class);
                startActivity(intent);
            }
        });

        btCommu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CommuActivity.class);
                startActivity(intent);
            }
        });

        btSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SportsActivity.class);
                startActivity(intent);
            }
        });

        btVmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), VmdActivity.class);
                startActivity(intent);
            }
        });

        btexit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
