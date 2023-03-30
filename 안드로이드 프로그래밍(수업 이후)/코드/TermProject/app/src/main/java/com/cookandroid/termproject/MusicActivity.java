
package com.cookandroid.termproject;


import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.annotation.Nullable;


public class MusicActivity extends Activity {

    Button btnBack;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);

        btnBack=findViewById(R.id.btnBack);

        final MediaPlayer mPlayer1, mPlayer2,mPlayer3;
        mPlayer1=MediaPlayer.create(this,R.raw.song1);
        mPlayer2=MediaPlayer.create(this,R.raw.song2);
        mPlayer3=MediaPlayer.create(this,R.raw.song3);

        final Switch switch1 = findViewById(R.id.switch1);
        final Switch switch2 = findViewById(R.id.switch2);
        final Switch switch3 = findViewById(R.id.switch3);

        //이웃집 토토로 듣기(1) 스위치 키고 끌때
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch1.isChecked() == true){
                    mPlayer1.start();
                 }
            else
                    mPlayer1.stop();
            }
        });


        //이웃집 토토로 듣기(2) 스위치 키고 끌때
        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch2.isChecked()==true) {
                    mPlayer2.start();
                }
                else
                    mPlayer2.stop();
            }
        });


        //센과 치히로의 행방불명 스위치 키고 끌때
        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch3.isChecked()==true) {
                    mPlayer3.start();
                }
                else
                    mPlayer3.stop();
            }
        });


        //BACK 버튼 클릭시
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}