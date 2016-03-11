package com.example.lightsoo.myglide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.lightsoo.myglide.Adapter.ImageAdapter;

/**
 * okhttp + glide를 이용해서
 * 이미지파일 업로드 다운로드
 */

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ImageAdapter imageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView)findViewById(R.id.lv_image);
        imageAdapter = new ImageAdapter();
        listView.setAdapter(imageAdapter);

    }
}
