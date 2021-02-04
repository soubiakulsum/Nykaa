package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
    private LinearLayout linearLayout;
    private View item;

    private void initView(View itemView) {
        item = itemView;
        textView = itemView.findViewById(R.id.textView);
        imageView = itemView.findViewById(R.id.imageView);
        imageViewStrip = itemView.findViewById(R.id.imageViewStrip);
        linearLayout = itemView.findViewById(R.id.linearLayout);
    }

    public void setData(LandingpageDataItem landingpageDataItem, RecyclerViewClickListener recyclerViewClickListener) {

        String url = landingpageDataItem.getWidgetData().getChildren().get(0).getChildren().get(0).getSource().mobile;
        if (url.charAt(url.length() - 1) == 'f' && url.charAt(url.length() - 2) == 'i' && url.charAt(url.length() - 2) == 'i') {
            textView.setText(landingpageDataItem.getWidgetData().getParameters().getTitle());
            imageViewStrip.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
            Glide.with(item.getContext()).asGif().load(landingpageDataItem.getWidgetData().getChildren().get(0).getChildren().get(0).getSource().mobile).into(imageView);
        } else {
            textView.setVisibility(View.GONE);
            imageView.setVisibility(View.GONE);
            imageViewStrip.setVisibility(View.VISIBLE);
            Glide.with(item.getContext()).load(landingpageDataItem.getWidgetData().getChildren().get(0).getChildren().get(0).getSource().mobile).into(imageViewStrip);
        }

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewClickListener.OnItemListClicked("dress.json");
            }
        });



        // Log.d("stugg", landingpageDataItem.getWidgetData().getParameters().getTitle());

    }
}
