package com.cookandroid.termproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class IntroActivity extends Activity {

    RadioGroup rGroup1;
    RadioButton cat,laputa,maru,mo,moving,sc,totoro,kiki;
    Button btnDetail,btnHome;

    TextView tvContext;
    ImageView ivPoster;

    View dialogView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        rGroup1=findViewById(R.id.rGroup1);

        cat=findViewById(R.id.cat);
        laputa=findViewById(R.id.laputa);
        maru=findViewById(R.id.maru);
        mo=findViewById(R.id.mo);
        moving=findViewById(R.id.moving);
        sc=findViewById(R.id.sc);
        totoro=findViewById(R.id.totoro);
        kiki=findViewById(R.id.kiki);

        btnDetail=findViewById(R.id.btnDetail);
        btnHome=findViewById(R.id.btnHome);


        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogView =View.inflate(IntroActivity.this,R.layout.dialog1,null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(IntroActivity.this);

                ivPoster=dialogView.findViewById(R.id.ivPoster);
                tvContext=dialogView.findViewById(R.id.tvContext);
                dlg.setView(dialogView);
                dlg.setIcon(R.drawable.ghibli);



                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.totoro:
                        dlg.setTitle("이웃집 토토로");
                        ivPoster.setImageResource(R.drawable.totoro);
                        tvContext.setText(" - 개봉 : 2001.07.28 \n - 등급 : 전체 관람가 \n - 장르 : 애니메이션, 가족, 판타지 \n - 러닝타임 : 87분\n");
                        break;
                    case R.id.moving:
                        dlg.setTitle("하울의 움직이는 성");
                        ivPoster.setImageResource(R.drawable.moving);
                        tvContext.setText(" - 개봉 : 2004.12.23 \n - 등급 : 전체 관람가 \n - 장르 : 애니메이션, 판타지 \n - 러닝타임 : 119분\n");
                        break;
                    case R.id.sc:
                        dlg.setTitle("센과 치히로의 행방불명");
                        ivPoster.setImageResource(R.drawable.sc);
                        tvContext.setText(" - 개봉 : 2002.06.28 \n - 등급 : 전체 관람가 \n - 장르 : 애니메이션, 판타지, 모험, 가족  \n - 러닝타임 : 126분\n");
                        break;
                    case R.id.cat:
                        dlg.setTitle("고양이의 보은");
                        ivPoster.setImageResource(R.drawable.cat);
                        tvContext.setText(" - 개봉 : 2003.08.08 \n - 등급 : 전체 관람가 \n - 장르 : 애니메이션, 모험, 판타지, 가족  \n - 러닝타임 : 75분\n");
                        break;
                    case R.id.maru:
                        dlg.setTitle("마루 밑 아리에티");
                        ivPoster.setImageResource(R.drawable.maru);
                        tvContext.setText(" - 개봉 : 2010.09.09 \n - 등급 : 전체 관람가 \n - 장르 : 애니메이션, 판타지 \n - 러닝타임 : 94분\n");
                        break;
                    case R.id.laputa:
                        dlg.setTitle("천공의 성 라퓨타");
                        ivPoster.setImageResource(R.drawable.laputa);
                        tvContext.setText(" - 개봉 : 2004.04.30 \n - 등급 : 전체 관람가 \n - 장르 : 애니메이션, 판타지, 모험 \n - 러닝타임 : 124분\n");
                        break;
                    case R.id.mo:
                        dlg.setTitle("모노노케 히메");
                        ivPoster.setImageResource(R.drawable.mo);
                        tvContext.setText(" - 개봉 : 2003.04.25 \n - 등급 : 전체 관람가 \n - 장르 : 애니메이션, 모험, 액션 \n - 러닝타임 : 135분\n");
                        break;
                    case R.id.kiki:
                        dlg.setTitle("마녀 배달부 키키");
                        ivPoster.setImageResource(R.drawable.kiki);
                        tvContext.setText(" - 개봉 : 2007 .11.22 \n - 등급 : 전체 관람가 \n - 장르 : 애니메이션, 모험, 판타지, 가족 \n - 러닝타임 : 102분\n");
                        break;
                }

                dlg.setPositiveButton("돌아가기!",null);
                dlg.show();
            }
        });


        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}

