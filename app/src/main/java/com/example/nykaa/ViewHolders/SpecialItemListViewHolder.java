package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.listItemsData.JsonMember1Item;
import com.example.nykaa.HelperClass.ImageLoader;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

public class SpecialItemListViewHolder extends RecyclerView.ViewHolder {
    public SpecialItemListViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private ImageView imageView;
    private View view;

    private void initView(View itemView) {
        view = itemView;
        imageView = itemView.findViewById(R.id.imageView);
    }

    public void setData(JsonMember1Item data, RecyclerViewClickListener recyclerViewClickListener) {
        ImageLoader.loadImage(view, imageView, data.getGridImageUrl());
    }
}
