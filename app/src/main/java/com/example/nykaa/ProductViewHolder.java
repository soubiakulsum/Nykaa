package com.example.nykaa;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ProductDetail.ProductMediaItem;
import com.example.nykaa.HelperClass.ImageLoader;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    private ImageView ivProductImage;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private View view;

    private void initViews(View itemView) {
        view = itemView;
        ivProductImage = itemView.findViewById(R.id.ivProductImage);
    }

    public void setData(ProductMediaItem productMediaItem) {

        if (productMediaItem.getUrl() != null && !productMediaItem.getUrl().equals("")) {
            ImageLoader.loadImage(view, ivProductImage, productMediaItem.getUrl());
        }

    }
}
