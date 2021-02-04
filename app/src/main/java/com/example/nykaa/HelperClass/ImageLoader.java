package com.example.nykaa.HelperClass;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ImageLoader {
    public static void loadImage(View view, ImageView imageView, String url) {
        Glide.with(view.getContext()).load(url).placeholder(new ColorDrawable(ImageLoader.getRandomColor())).into(imageView);
    }

    public static int getRandomColor() {
        List<Integer> colours = new ArrayList<>();
        colours.add(Color.parseColor("#FED8A9"));
        colours.add(Color.parseColor("#C599D6"));
        colours.add(Color.parseColor("#78D6C6"));
        colours.add(Color.parseColor("#A6B8FF"));
        colours.add(Color.parseColor("#E5B9D2"));
        colours.add(Color.parseColor("#FFEABF"));
        colours.add(Color.parseColor("#CCBBE5"));
        colours.add(Color.parseColor("#BCE4FE"));
        colours.add(Color.parseColor("#DAF5A8"));
        colours.add(Color.parseColor("#FFA4B5"));
        colours.add(Color.parseColor("#92CED8"));
        colours.add(Color.parseColor("#DBCBA7"));

        Random rand = new Random();
        return colours.get(rand.nextInt(colours.size()));
    }
}
