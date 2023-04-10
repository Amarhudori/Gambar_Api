package com.example.gambar_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gambar = findViewById(R.id.gambar);

        Glide.with(getApplicationContext())
                .load("https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/71Eq1-7q8sL.jpg")
                .into(gambar);
    }
}