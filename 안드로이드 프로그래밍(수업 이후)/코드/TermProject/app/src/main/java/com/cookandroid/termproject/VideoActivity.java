package com.cookandroid.termproject;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoActivity extends AppCompatActivity {

    VideoView vv;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        setTitle("동영상 보기 :)");

        vv= findViewById(R.id.vv);
        btnBack=findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //비디오의 URI
        Uri videoUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abc);

        //비디오뷰의 재생, 일시정지 등을 할 수 있는 '컨트롤바'를 붙여주는 작업
        vv.setMediaController(new MediaController(this));

        vv.setVideoURI(videoUri);

        vv.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vv.start();
            }
        });
    }

    //화면에 안보일 때
    @Override
    protected void onPause(){
        super.onPause();

        //비디오 일시 정지
        if(vv!=null&&vv.isPlaying())
            vv.pause();
    }

    //액티비티가 메모리에서 사라질 때
    @Override
    protected void onDestroy(){
        super.onDestroy();
        if(vv!=null)
            vv.stopPlayback();
    }




}
