package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.listItemsData.JsonMember1Item;
import com.example.nykaa.HelperClass.ImageLoader;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

public class ItemListViewHolder extends RecyclerView.ViewHolder {
    public ItemListViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private ImageView imageView;
    private TextView tvProductName;
    private TextView tvSubTitle;
    private TextView tvDiscountPrice;
    private TextView tvPrice;
    private TextView tvDiscount;
    private View view;

    private void initView(View itemView) {
        view = itemView;
        imageView = itemView.findViewById(R.id.imageView2);
        tvProductName = itemView.findViewById(R.id.tvProductName);
        tvSubTitle = itemView.findViewById(R.id.tvSubTitle);
        tvDiscountPrice = itemView.findViewById(R.id.tvDiscountPrice);
        tvPrice = itemView.findViewById(R.id.tvPrice);
        tvDiscount = itemView.findViewById(R.id.tvDiscount);
    }

    public void setData(JsonMember1Item data, RecyclerViewClickListener recyclerViewClickListener) {
        ImageLoader.loadImage(view, imageView, data.getImageUrl());
        tvProductName.setText(data.getTitle());
        tvSubTitle.setText(data.getSubTitle());
        tvDiscountPrice.setText(data.getDiscountedPrice()+"");
        tvPrice.setText(data.getPrice()+"");
        tvDiscount.setText(data.getDiscount() + "% off");
    }
}
