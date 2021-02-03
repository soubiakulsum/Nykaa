package com.example.nykaa.ViewHolders;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Adapters.ItemColumnGridRecyclerViewAdapter;
import com.example.nykaa.Data.homeData.LandingpageDataItem;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

public class ColumnGridRecyclerViewHolder extends RecyclerView.ViewHolder {
    public ColumnGridRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private TextView textView;
    private RecyclerView recyclerview;
    private LinearLayoutManager linearLayoutManager;

    private void initViews(View itemView) {
        linearLayoutManager = new LinearLayoutManager(itemView.getContext());
        textView = itemView.findViewById(R.id.textView);
        recyclerview = itemView.findViewById(R.id.recyclerview);
    }

    public void setData(LandingpageDataItem landingpageDataItem, RecyclerViewClickListener recyclerViewClickListener) {
        textView.setText(landingpageDataItem.getWidgetData().getParameters().getTitle());
        ItemColumnGridRecyclerViewAdapter itemColumnGridRecyclerViewAdapter = new ItemColumnGridRecyclerViewAdapter(landingpageDataItem.getWidgetData().getChildren(), recyclerViewClickListener);
        recyclerview.setLayoutManager(linearLayoutManager);
        recyclerview.setAdapter(itemColumnGridRecyclerViewAdapter);

    }
}
