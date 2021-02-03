package com.example.nykaa.ViewHolders;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Adapters.ItemHouseOfNiykaaAdapter;
import com.example.nykaa.Data.homeData.LandingpageDataItem;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

public class HouseOfNykaaViewHolder extends RecyclerView.ViewHolder {
    public HouseOfNykaaViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private TextView textView;
    private RecyclerView recyclerview;
    private GridLayoutManager gridLayoutManager;

    private void initView(View itemView) {

        gridLayoutManager = new GridLayoutManager(itemView.getContext(), 2, LinearLayoutManager.VERTICAL, false);
        textView = itemView.findViewById(R.id.textView);
        recyclerview = itemView.findViewById(R.id.recyclerview);
    }

    public void setData(LandingpageDataItem landingpageDataItem, RecyclerViewClickListener recyclerViewClickListener) {
        textView.setText(landingpageDataItem.getWidgetData().getParameters().getTitle());
        ItemHouseOfNiykaaAdapter itemHouseOfNiykaaAdapter = new ItemHouseOfNiykaaAdapter(landingpageDataItem.getWidgetData().getChildren(), recyclerViewClickListener);
        recyclerview.setLayoutManager(gridLayoutManager);
        recyclerview.setAdapter(itemHouseOfNiykaaAdapter);
    }
}
