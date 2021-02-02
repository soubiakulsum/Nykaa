package com.example.nykaa.ViewHolders;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.nykaa.Data.homeData.LandingpageDataItem;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

public class HomeImageTypeViewHolder extends RecyclerView.ViewHolder {
    public HomeImageTypeViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private TextView textView;
    private ImageView imageView;
    private ImageView imageViewStrip;
    private View item;

    private void initView(View itemView) {
        item = itemView;
        textView = itemView.findViewById(R.id.textView);
        imageView = itemView.findViewById(R.id.imageView);
        imageViewStrip = itemView.findViewById(R.id.imageViewStrip);
    }

    public void setData(LandingpageDataItem landingpageDataItem, RecyclerViewClickListener recyclerViewClickListener) {
        if(!landingpageDataItem.getInventoryName().equals("hp.strips")){
            textView.setText(landingpageDataItem.getWidgetData().getParameters().getTitle());
            imageViewStrip.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
            Glide.with(item.getContext())
                    .asGif()
                    .load(landingpageDataItem.getWidgetData().getChildren().get(0).getChildren().get(0).getSource().mobile)
                    .into(imageView);
        }else {
            textView.setVisibility(View.GONE);
            imageView.setVisibility(View.GONE);
            imageViewStrip.setVisibility(View.VISIBLE);
            Glide.with(item.getContext())
                    .load(landingpageDataItem.getWidgetData().getChildren().get(0).getChildren().get(0).getSource().mobile)
                    .into(imageViewStrip);
        }
      // Log.d("stugg", landingpageDataItem.getWidgetData().getParameters().getTitle());

    }
}
