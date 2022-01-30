package com.cookandroid.termproject;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStart,btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("♥지브리 설명 앱♥");

        btnStart = findViewById(R.id.btnStart);
        registerForContextMenu(btnStart);

        btnMain=findViewById(R.id.btnMain);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appintent=new Intent(getApplicationContext(),SecondMainActivity.class);
                startActivity(appintent);
            }
        });

    }

    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();
        if (v == btnStart) {
            menu.setHeaderTitle("선택해봅시다 :) ");

            mInflater.inflate(R.menu.menu1, menu);
        }
    }


    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.goMap:
                Intent mapintent=new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(mapintent);
                return true;
            case R.id.goVideo:
                Intent videointent=new Intent(getApplicationContext(),VideoActivity.class);
                startActivity(videointent);
                return true;
            case R.id.goMusic:
                Intent musicintent=new Intent(getApplicationContext(),MusicActivity.class);
                startActivity(musicintent);
                return true;
        }
        return false;
    }

}