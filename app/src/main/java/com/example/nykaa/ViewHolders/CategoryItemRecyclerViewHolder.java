package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.categoryData.CategoryDataModel;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

public class CategoryItemRecyclerViewHolder extends RecyclerView.ViewHolder {

    private RecyclerViewClickListener recyclerViewClickListener;

    public CategoryItemRecyclerViewHolder(@NonNull View itemView, RecyclerViewClickListener recyclerViewClickListener) {
        super(itemView);
        this.recyclerViewClickListener = recyclerViewClickListener;
        initViews(itemView);
    }

    private ImageView itemImageView;

    private void initViews(View itemView) {
        itemImageView = itemView.findViewById(R.id.itemImageView);
    }

    public void SetData(CategoryDataModel categoryDataModel) {

        itemImageView.setImageResource(categoryDataModel.getResource());

        itemImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewClickListener.OnCategoryItemClicked(categoryDataModel.getType());
            }
        });
    }

}
