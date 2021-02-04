package com.example.nykaa;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    private ImageView ivProductImage;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivProductImage = itemView.findViewById(R.id.ivProductImage);
    }

    public void setData(ProductModelClass productModelClass) {
        ivProductImage.setImageResource(productModelClass.getIvProductImage());
    }
}
