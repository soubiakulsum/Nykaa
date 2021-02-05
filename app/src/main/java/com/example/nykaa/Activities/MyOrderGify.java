package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

import com.example.nykaa.R;

public class MyOrderGify extends AppCompatActivity {

    VideoView mMyOrderGify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order_gify);

        mMyOrderGify = (VideoView) findViewById(R.id.MyOrderGify);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.gify);

        mMyOrderGify.setVideoURI(uri);
        mMyOrderGify.start();

        mMyOrderGify.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MyOrderGify.this, MyOrderActivity.class);

                startActivity(intent);
                finish();
            }

        },9000);


    }
    }
