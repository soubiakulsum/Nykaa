package com.example.nykaa.HelperClass;

import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

public class ImageLoader {
    public static void loadImage(View view, ImageView imageView, String url) {
        Glide.with(view.getContext()).load(url).into(imageView);
    }
}
