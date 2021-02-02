package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Adapters.ItemColumnGridTopCateAdapter;
import com.example.nykaa.Data.homeData.LandingpageDataItem;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

public class ColumnGridTopCateViewHolder extends RecyclerView.ViewHolder {
    public ColumnGridTopCateViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private TextView textView;
    private RecyclerView recyclerview;
    private GridLayoutManager gridLayoutManager;

    private void initViews(View itemView) {
        gridLayoutManager = new GridLayoutManager(itemView.getContext(), 2, LinearLayoutManager.VERTICAL, false);
        textView = itemView.findViewById(R.id.textView);
        recyclerview = itemView.findViewById(R.id.recyclerview);
    }

    public void setData(LandingpageDataItem landingpageDataItem, RecyclerViewClickListener recyclerViewClickListener) {
        textView.setText(landingpageDataItem.getWidgetData().getParameters().getTitle());
        ItemColumnGridTopCateAdapter itemColumnGridTopCateAdapter = new ItemColumnGridTopCateAdapter(recyclerViewClickListener, landingpageDataItem.getWidgetData().getChildren());
        recyclerview.setLayoutManager(gridLayoutManager);
        recyclerview.setAdapter(itemColumnGridTopCateAdapter);
    }
}
