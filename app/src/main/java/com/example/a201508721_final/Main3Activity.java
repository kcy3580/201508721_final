package com.example.a201508721_final;

import android.app.TabActivity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class Main3Activity extends TabActivity {
    Button btHeung, btHocheon, btChoil, btSejong, btJ, btSeoil, btJiduck, btLib, btBae, btNuri, btEntrance, btK, btexit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TabHost tabHost = getTabHost();

        TabSpec tabSpecTotal1 = tabHost.newTabSpec("TOTAL1").setIndicator("학사통계");
        tabSpecTotal1.setContent(R.id.tabTotal1);
        tabHost.addTab(tabSpecTotal1);

        TabSpec tabSpecScience = tabHost.newTabSpec("TOTAL2").setIndicator("입시통계");
        tabSpecScience.setContent(R.id.tabTotal2);
        tabHost.addTab(tabSpecScience);

        tabHost.setCurrentTab(0);

        btHeung = (Button) findViewById(R.id.btHeung);
        btHocheon = (Button) findViewById(R.id.btHocheon);
        btChoil = (Button) findViewById(R.id.btChoil);
        btSejong = (Button) findViewById(R.id.btSejong);
        btJ = (Button) findViewById(R.id.btJ);
        btSeoil = (Button) findViewById(R.id.btSeoil);
        btJiduck = (Button) findViewById(R.id.btJiduck);
        btLib = (Button) findViewById(R.id.btLib);
        btBae = (Button) findViewById(R.id.btBae);
        btNuri = (Button) findViewById(R.id.btNuri);
        btEntrance = (Button) findViewById(R.id.btEntrance);
        btK = (Button) findViewById(R.id. btK);
        btexit2 = (Button) findViewById(R.id.btexit2);

        btHeung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("흥학관");
                dlg.setMessage("공사중");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btHocheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("호천관");
                dlg.setMessage("| 11F | 대회의실,홍보관,법인사무국\n,법인이사장실\n\n"
                        + "| 10F | 세미나실,공용강의실\n\n"
                        + "| 9F | 패션산업학과,세미나실\n,공용강의실,사회맞춤형사업지원실\n\n"
                        + "| 8F | 사무처장실,공용강의실\n\n"
                        + "| 7F | 기획조정처장실,공용강의실\n\n"
                        + "| 6F | 산업협력처장실,창업교육센터,\n공용강의실,CreativeSpace2\n\n"
                        + "| 5F | 옥외정원,교무처장실,\n공용강의실,CreativeSpace1\n\n"
                        + "| 4F | 입학홍보처장실,휴게실\n,컴퓨터전자공확과 기자재실\n"
                        + ",소프트웨어공학과 기자재실,컴퓨터전자공학과실습실,연구실\n"
                        + ",컴퓨터전자공학과 학과사무실,\n학생상담센터\n\n"
                        + "| 3F | 입학홍보처,휴게실,소프트웨어공학과 학과사무실\n"
                        + ",컴퓨터전자공학과 실습실,공용강의실,연구실,총장실\n\n"
                        + "| 2F | 산학협력처,교무처,기획조정처,사무처,회계서고,연구실,\n"
                        + "직무역량지원센터,현장실습지원센터\n\n"
                        + "| 1F | 국제학생지원센터,평생교육원,전시 및 다목적실\n\n"
                        + "| B1 | 지하주차장,방재실\n\n"
                        + "| 외부 | 국제회의장,국제학생지원센터,CreativeSpace,\n"
                        + " 평생교육원,전시 및 다목적실\n");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btChoil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("초일관");
                dlg.setMessage("공사중");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btSejong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("세종관");
                dlg.setMessage("| 9F | 간호학과\n\n"
                        + "| 8F | 강의실,실습실\n\n"
                        + "| 7F | 실습실\n\n"
                        + "| 6F | 강의실,실습실\n\n"
                        + "| 5F | 강의실,실습실\n\n"
                        + "| 4F | 강의실\n\n"
                        + "| 3F | 식품영양학과,실습실\n\n"
                        + "| 2F | 사회복지학과,실습실\n\n"
                        + "| 1F | 실습실\n\n"
                        + "| B1 | \n");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("J동");
                dlg.setMessage("| B1 | 형상사실회암실,아트마당\n,스트라이커,설계반,\n컴퓨닉스,C.C.C,\n유스호스텔,센세이션");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btSeoil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("서일관");
                dlg.setMessage("| 6F | 강의실,실습실\n\n"
                        + "| 5F | 건축공학과\n\n"
                        + "| 4F | 실내디자인과\n\n"
                        + "| 3F | 커뮤니케이션디자인학과\n\n"
                        + "| 2F | 생명화공학과\n\n"
                        + "| 1F | 사무처시설관리팀,학보사\n");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btJiduck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("지덕관");
                dlg.setMessage("| 7F | 레저스포츠학과(레크레이션)\n\n"
                        + "| 6F | 레저스포츠학과(생활스포츠골프)\n\n"
                        + "| 5F | 비즈니스 영어,일본어과\n\n"
                        + "| 4F | 비즈니스중국어과\n,생활가구디자인과\n,정보통신공학과\n\n"
                        + "| 3F | 유아교육학과,전기공학과\n\n"
                        + "| 2F | 대의원회,총학생회\n\n"
                        + "| 1F | 서일방송국\n\n"
                        + "| B1 | 시청각실,세미나실\n");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btLib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("도서관");
                dlg.setMessage("| 12F | 제3자료 열람실,영상정보실,\n도서관장실\n\n"
                        + "| 11F | 제2자료 열람실(도서대출)\n\n"
                        + "| 10F | 제1자료 열람실,사서과\n\n"
                        + "| 9F | 제6자유열람실,정보검색실\n\n"
                        + "| 8F | 제1~5자유열람실\n\n"
                        + "| 7F | 보육교사교육원\n\n"
                        + "| 6F | 강의실\n\n"
                        + "| 5F | 세무회계학과\n\n"
                        + "| 4F | 자산법률학과\n\n"
                        + "| 3F | 미디어출판학과\n\n"
                        + "| 2F | 교양교육센터,스터디룸\n\n"
                        + "| 1F | 잡카페,취업상담실,무인도서반납기\n");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btBae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("배양관");
                dlg.setMessage("| 7F | 가람실,하늘공원\n\n"
                        + "| 6F | 강의실,정보관리센터(센터장실)\n\n"
                        + "| 5F | 강의실,공원\n\n"
                        + "| 4F | 어학실,강의실,강사휴게실\n\n"
                        + "| 3F | 컴퓨터실습실\n\n"
                        + "| 2F | 정보관리지원실,컴퓨터실습실\n\n"
                        + "| 1F | 학생지원처,취업지원팀,\nSU일자리본부,보건실,\n교수학습지원센터,강사휴게실\n\n"
                        + "| B1 | 연극영화학과\n\n"
                        + "| B2 | 예다움홀\n\n"
                        + "| B3 | 예다움홀\n");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btNuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("누리관");
                dlg.setMessage("| 7F | 산업경영학과,희의실\n\n"
                        + "| 6F | 강의실,실습실\n\n"
                        + "| 5F | 실습실\n\n"
                        + "| 4F | 실습실\n\n"
                        + "| 3F | 토목공학과\n\n"
                        + "| 2F | 스마트자동차공학과\n\n"
                        + "| 1F | 실습실\n\n"
                        + "| B1 | 실습실\n");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btEntrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("정문");
                dlg.setMessage("정문");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
                dlg.setTitle("K동");
                dlg.setMessage("| 4F | 보육교사 교육원 행정실,\n어린이집 교사실\n\n"
                        + "| 3F | 보육실,재료실\n\n"
                        + "| 2F | 보육실,어린이집 행정실\n\n"
                        + "| 1F | 보육실, 어린이집 식당\n\n"
                        + "| B1 | 어린이집 실내유희실\n");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btexit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
