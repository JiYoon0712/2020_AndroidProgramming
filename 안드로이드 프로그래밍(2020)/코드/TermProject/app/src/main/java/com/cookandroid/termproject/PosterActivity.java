package com.cookandroid.termproject;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class PosterActivity extends Activity {

    ImageView photo;
    View toastView;
    TextView toastText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poster);
        final Toast toast=new Toast(PosterActivity.this);
        toastView = View.inflate(PosterActivity.this,R.layout.toast1,null);
        toastText = toastView.findViewById(R.id.toastText1);

        photo = findViewById(R.id.photo);

        final String[] title = {"이웃집 토토로","하울의 움직이는 성","센과 치히로의 행방불명","고양이의 보은","마루 밑 아리에티"
                ,"천공의 성 라퓨타","모노노케 히메","마녀 배달부 키키"};
        final Integer[] posterID ={R.drawable.totoro,R.drawable.moving,R.drawable.sc,R.drawable.cat,R.drawable.maru,R.drawable.laputa,
                R.drawable.mo, R.drawable.kiki};

        ListView list = findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,title);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                photo.setImageResource(posterID[arg2]);
                //Toast.makeText(getApplicationContext(),title[arg2],Toast.LENGTH_SHORT).show();
                toastText.setText(title[arg2]);
                toast.setView(toastView);
                toast.show();
            }
        });


    }
}

