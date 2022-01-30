package com.cookandroid.termproject;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class AddActivity extends Activity {

    Button btnGhibli,btnDotori,btnHome;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);


        btnGhibli=findViewById(R.id.btnGhibli);
        btnDotori=findViewById(R.id.btnDotori);
        btnHome =findViewById(R.id.btnHome);

        //지브리 공식 홈페이지 클릭시
        btnGhibli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "지브리 공식 홈페이지로 이동합니다.", Toast.LENGTH_SHORT).show();
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ghibli.jp/"));
                startActivity(mIntent);
            }
        });

        //도토리숲 공식 홈페이지 클릭시
        btnDotori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "도토리숲 공식 홈페이지로 이동합니다.", Toast.LENGTH_SHORT).show();
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dotorisup.com/"));
                startActivity(mIntent);
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