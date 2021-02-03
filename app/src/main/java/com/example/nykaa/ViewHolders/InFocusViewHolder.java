package com.example.nykaa.ViewHolders;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Adapters.ItemInfocusAdapter;
import com.example.nykaa.Data.homeData.LandingpageDataItem;
import com.example.nykaa.HelperClass.ImageLoader;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

public class InFocusViewHolder extends RecyclerView.ViewHolder {
    public InFocusViewHolder(@NonNull View itemView) {
        super(itemView);
        intiView(itemView);
    }


    private RecyclerView recyclerview;
    private ImageView imageView;
    private LinearLayoutManager linearLayoutManager;
    private View view;
    private LinearLayout linearLayout;

    private void intiView(View itemView) {
        view = itemView;
        recyclerview = itemView.findViewById(R.id.recyclerview);
        imageView = itemView.findViewById(R.id.imageView);
        linearLayout = itemView.findViewById(R.id.linearLayout);

        linearLayoutManager = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);
    }

    public void setData(LandingpageDataItem landingpageDataItem, RecyclerViewClickListener recyclerViewClickListener) {


        ImageLoader.loadImage(view, imageView, landingpageDataItem.getWidgetData().getChildren().get(0).getChildren().get(0).getSource().mobile);
        if (landingpageDataItem.getWidgetData().getParameters().getAppBkgType() != null && landingpageDataItem.getWidgetData().getParameters().getAppBkgType().equals("color")) {
            linearLayout.setBackgroundColor(Color.parseColor(landingpageDataItem.getWidgetData().getParameters().getAppBkgColor()));
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }

        ItemInfocusAdapter itemInfocusAdapter = new ItemInfocusAdapter(landingpageDataItem.getWidgetData().getChildren(), recyclerViewClickListener);
        recyclerview.setLayoutManager(linearLayoutManager);
        recyclerview.setAdapter(itemInfocusAdapter);
    }
}
