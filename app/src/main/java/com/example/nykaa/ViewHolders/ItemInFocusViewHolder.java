package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.homeData.ChildrenItem;
import com.example.nykaa.HelperClass.ImageLoader;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

public class ItemInFocusViewHolder extends RecyclerView.ViewHolder {
    public ItemInFocusViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private ImageView imageView;
    private View view;

    private void initView(View itemView) {
        view = itemView;
        imageView = itemView.findViewById(R.id.imageView);
    }

    public void setData(ChildrenItem childrenItem, RecyclerViewClickListener recyclerViewClickListener) {
        if (childrenItem.getChildren().get(0).getSource().mobile == null || childrenItem.getChildren().get(0).getSource().mobile.equals("")) {
            ImageLoader.loadImage(view, imageView, childrenItem.getChildren().get(0).getSource().web);
        } else {
            ImageLoader.loadImage(view, imageView, childrenItem.getChildren().get(0).getSource().mobile);
        }
    }
}
