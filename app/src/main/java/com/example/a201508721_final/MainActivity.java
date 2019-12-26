package com.example.a201508721_final;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btstart, btinput, bteditor, btend;
    View inputdlg;
    EditText dlgETname, dlgETage, dlgETmajor;
    TextView tvName, tvAge, tvMajor, tvName2, tvAge2, tvMajor2;
    private Handler mHandler;
    private ProgressDialog mProgressDialog;
    RelativeLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Seoil University");

        btstart = (Button) findViewById(R.id.btstart);
        btinput = (Button) findViewById(R.id.btinput);
        bteditor = (Button) findViewById(R.id.bteditor);
        btend = (Button) findViewById(R.id.btend);
        inputdlg = (View) findViewById(R.id.inputdlg);
        dlgETname = (EditText) findViewById(R.id.dlgETname);
        dlgETage = (EditText) findViewById(R.id.dlgETage);
        dlgETmajor = (EditText) findViewById(R.id.dlgETmajor);
        tvName = (TextView) findViewById(R.id.tvName);
        tvAge = (TextView) findViewById(R.id.tvAge);
        tvMajor = (TextView) findViewById(R.id.tvMajor);
        tvName2 = (TextView) findViewById(R.id.tvName2);
        tvAge2 = (TextView) findViewById(R.id.tvAge2);
        tvMajor2 = (TextView) findViewById(R.id.tvMajor2);
        main = (RelativeLayout) findViewById(R.id.main);

        btinput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputdlg = (View) View.inflate(MainActivity.this, R.layout.inputdlg, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setView(inputdlg);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dlgETname = (EditText) inputdlg.findViewById(R.id.dlgETname);
                        dlgETage = (EditText) inputdlg.findViewById(R.id.dlgETage);
                        dlgETmajor = (EditText) inputdlg.findViewById(R.id.dlgETmajor);

                        tvName.setText(dlgETname.getText().toString());
                        tvAge.setText(dlgETage.getText().toString());
                        tvMajor.setText(dlgETmajor.getText().toString());

                        tvName.setTextColor(Color.WHITE);
                        tvAge.setTextColor(Color.WHITE);
                        tvMajor.setTextColor(Color.WHITE);

                        tvName2.setTextColor(Color.WHITE);
                        tvAge2.setTextColor(Color.WHITE);
                        tvMajor2.setTextColor(Color.WHITE);

                        if(tvName.getText().toString().length() == 0)
                        {
                            tvName2.setTextColor(Color.WHITE);
                        }

                        if(tvAge.getText().toString().length() == 0)
                        {
                            tvAge2.setTextColor(Color.WHITE);
                        }

                        if(tvMajor.getText().toString().length() == 0)
                        {
                            tvMajor2.setTextColor(Color.WHITE);
                        }
                    }
                });
                dlg.setNegativeButton("취소", null);
                dlg.show();
            }
        });



        btstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvName.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "사용자 정보를 모두 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else if (tvAge.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "사용자 정보를 모두 입력하세요.", Toast.LENGTH_SHORT).show();
                }

                else if ( tvMajor.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "사용자 정보를 모두 입력하세요.", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Toast.makeText(getApplicationContext(), "곧 시작됩니다.", Toast.LENGTH_SHORT).show();
                    mHandler = new Handler();

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mProgressDialog = ProgressDialog.show(MainActivity.this,"","잠시만 기다려 주세요", true);
                            mHandler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        if (mProgressDialog != null && mProgressDialog.isShowing()){
                                            mProgressDialog.dismiss();
                                        }
                                    }
                                    catch (Exception e)
                                    {
                                        e.printStackTrace();
                                    }
                                }
                            }, 2000);
                            final String name = dlgETname.getText().toString();
                            final String age = dlgETage.getText().toString();
                            final String major = dlgETmajor.getText().toString();

                            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                            intent.putExtra("tvNmae4",name);
                            intent.putExtra("tvAge4",age);
                            intent.putExtra("tvMajor4",major);
                            startActivity(intent);
                        }
                    });
                }
            }
        });

        bteditor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("EDITOR");
                dlg.setMessage("서일대학교앱을 찾아주셔서 감사합니다.\n"
                        + "-----------------------------------------------------------\n"
                        + "이  름 : 김찬영\n"
                        + "나  이 : 24세\n"
                        + "소  속 : 서일대학교 컴퓨터응용전자과\n"
                        + "연락처 : 010 - 5031 - 7825\n"
                        + "이메일 : kcy3580@naver.com\n");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        btend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("정말로 종료하시겠습니까?");
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
                alert.setTitle("종료 알림창");
                alert.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemHome:
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://hm.seoil.ac.kr/"));
                startActivity(myIntent);
                return true;

            case R.id.itemEnd:
                finish();
                return true;
        }
        return false;
    }
}
