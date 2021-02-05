package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;


import com.example.nykaa.R;

public class LoginActivity extends AppCompatActivity {

    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mVideoView = (VideoView) findViewById(R.id.VideoView);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);

        mVideoView.setVideoURI(uri);
        mVideoView.start();

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
    }

        });
    }

    public void Phone(View view) {
        Intent intent = new Intent(LoginActivity.this, Phone_Authentication.class);
        startActivity(intent);
    }
}

