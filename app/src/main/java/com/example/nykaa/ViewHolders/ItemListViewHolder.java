package com.example.nykaa.ViewHolders;

import android.graphics.Paint;
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
    private TextView tvTag;
    private TextView tvRupee;
    private View view;

    private void initView(View itemView) {
        view = itemView;
        imageView = itemView.findViewById(R.id.imageView2);
        tvProductName = itemView.findViewById(R.id.tvProductName);
        tvSubTitle = itemView.findViewById(R.id.tvSubTitle);
        tvDiscountPrice = itemView.findViewById(R.id.tvDiscountPrice);
        tvPrice = itemView.findViewById(R.id.tvPrice);
        tvDiscount = itemView.findViewById(R.id.tvDiscount);
        tvTag = itemView.findViewById(R.id.tvTag);
        tvRupee = itemView.findViewById(R.id.textView3);
    }

    public void setData(JsonMember1Item data, RecyclerViewClickListener recyclerViewClickListener) {
        ImageLoader.loadImage(view, imageView, data.getImageUrl());
        tvProductName.setText(data.getTitle());
        tvSubTitle.setText(data.getSubTitle());
        tvDiscountPrice.setText(data.getDiscountedPrice() + "");
        tvPrice.setText(data.getPrice() + "");
        tvPrice.setPaintFlags(tvPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        tvRupee.setPaintFlags(tvRupee.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        tvDiscount.setText(data.getDiscount() + "% off");
        if (data.getTag().getTitle() != null && !data.getTag().getTitle().equals("")) {
            tvTag.setVisibility(View.VISIBLE);
            tvTag.setText(data.getTag().getTitle());
        } else {
            tvTag.setVisibility(View.GONE);
        }
    }
}
