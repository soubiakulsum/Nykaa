package com.example.nykaa.ViewHolders;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
    private LinearLayout linearLayout;

    private void initViews(View itemView) {
        linearLayoutManager = new LinearLayoutManager(itemView.getContext());
        textView = itemView.findViewById(R.id.textView);
        recyclerview = itemView.findViewById(R.id.recyclerview);
        linearLayout = itemView.findViewById(R.id.linearLayout);
    }

    public void setData(LandingpageDataItem landingpageDataItem, RecyclerViewClickListener recyclerViewClickListener) {
        if (landingpageDataItem.getWidgetData().getParameters().getTitle() == null || landingpageDataItem.getWidgetData().getParameters().getTitle().equals("")) {
            textView.setVisibility(View.GONE);
        } else {
            textView.setVisibility(View.VISIBLE);
            textView.setText(landingpageDataItem.getWidgetData().getParameters().getTitle());
        }
        if (landingpageDataItem.getWidgetData().getParameters().getAppBkgType() != null && landingpageDataItem.getWidgetData().getParameters().getAppBkgType().equals("color")) {
            linearLayout.setBackgroundColor(Color.parseColor(landingpageDataItem.getWidgetData().getParameters().getAppBkgColor()));
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }

        ItemColumnGridRecyclerViewAdapter itemColumnGridRecyclerViewAdapter = new ItemColumnGridRecyclerViewAdapter(landingpageDataItem.getWidgetData().getChildren(), recyclerViewClickListener);
        recyclerview.setLayoutManager(linearLayoutManager);
        recyclerview.setAdapter(itemColumnGridRecyclerViewAdapter);

    }
}
