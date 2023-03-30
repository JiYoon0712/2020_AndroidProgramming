package com.cookandroid.termproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;


public class ReviewActivity extends Activity {

    Button btnTotoro,btnMoving,btnSc,btnCat,btnMaru,btnLaputa,btnMo,btnKiki;
    TextView tvReview;
    RatingBar star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review);

        btnTotoro =findViewById(R.id.btnTotoro);
        btnMoving =findViewById(R.id.btnMoving);
        btnSc=findViewById(R.id.btnSc);
        btnCat=findViewById(R.id.btnCat);
        btnMaru=findViewById(R.id.btnMaru);
        btnLaputa=findViewById(R.id.btnLaputa);
        btnMo=findViewById(R.id.btnMo);
        btnKiki=findViewById(R.id.btnKiki);

        tvReview=findViewById(R.id.tvReview);
        star=findViewById(R.id.star);


        //이웃집 토토로 클릭시 -> 평점과 리뷰 확인
        btnTotoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    star.setRating((float) 9.5);
                    InputStream inputs = getResources().openRawResource(R.raw.raw_totoro);
                    byte[] txt = new byte[inputs.available()];
                    inputs.read(txt);
                    tvReview.setText(new String(txt));
                    inputs.close();
                }catch (IOException e) {}
            }
        });


        //하울의 움직이는 성 클릭시 -> 평점과 리뷰 확인
        btnMoving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    star.setRating((float) 9.3);
                    InputStream inputs = getResources().openRawResource(R.raw.raw_moving);
                    byte[] txt = new byte[inputs.available()];
                    inputs.read(txt);
                    tvReview.setText(new String(txt));
                    inputs.close();
                }catch (IOException e) {}
            }
        });

        //센과 치히로의 행방불명 클릭시 -> 평점과 리뷰 확인
        btnSc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    star.setRating((float) 9.5);
                    InputStream inputs = getResources().openRawResource(R.raw.raw_sc);
                    byte[] txt = new byte[inputs.available()];
                    inputs.read(txt);
                    tvReview.setText(new String(txt));
                    inputs.close();
                }catch (IOException e) {}
            }
        });

        //고양이의 보은 클릭시 -> 평점과 리뷰 확인
        btnCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    star.setRating((float) 8.6);
                    InputStream inputs = getResources().openRawResource(R.raw.raw_cat);
                    byte[] txt = new byte[inputs.available()];
                    inputs.read(txt);
                    tvReview.setText(new String(txt));
                    inputs.close();
                }catch (IOException e) {}
            }
        });

        //마루 밑 아리에티 클릭시 -> 평점과 리뷰 확인
        btnMaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    star.setRating((float) 8.2);
                    InputStream inputs = getResources().openRawResource(R.raw.raw_maru);
                    byte[] txt = new byte[inputs.available()];
                    inputs.read(txt);
                    tvReview.setText(new String(txt));
                    inputs.close();
                }catch (IOException e) {}
            }
        });

        //천공의 성 라퓨타 클릭시 -> 평점과 리뷰 확인
        btnLaputa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    star.setRating((float) 9.3);
                    InputStream inputs = getResources().openRawResource(R.raw.raw_laputa);
                    byte[] txt = new byte[inputs.available()];
                    inputs.read(txt);
                    tvReview.setText(new String(txt));
                    inputs.close();
                }catch (IOException e) {}
            }
        });

        //모노노케 히메 클릭시 -> 평점과 리뷰 확인
        btnMo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    star.setRating((float) 9.3);
                    InputStream inputs = getResources().openRawResource(R.raw.raw_mo);
                    byte[] txt = new byte[inputs.available()];
                    inputs.read(txt);
                    tvReview.setText(new String(txt));
                    inputs.close();
                }catch (IOException e) {}
            }
        });

        //마녀 배달부 키키 클릭시 -> 평점과 리뷰 확인
        btnKiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    star.setRating((float) 9.4);
                    InputStream inputs = getResources().openRawResource(R.raw.raw_kiki);
                    byte[] txt = new byte[inputs.available()];
                    inputs.read(txt);
                    tvReview.setText(new String(txt));
                    inputs.close();
                }catch (IOException e) {}
            }
        });
    }

}