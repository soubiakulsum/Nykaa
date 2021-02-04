package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.homeData.ChildrenItem;
import com.example.nykaa.HelperClass.ImageLoader;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

public class ItemHouseOfNykaaViewHolder extends RecyclerView.ViewHolder {
    public ItemHouseOfNykaaViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private ImageView imgaveView;
    private TextView textView;
    private LinearLayout linearLayout;
    private View view;

    private void initView(View itemView) {
        view = itemView;
        imgaveView = itemView.findViewById(R.id.imgaveView);
        textView = itemView.findViewById(R.id.textView);
        linearLayout = itemView.findViewById(R.id.linearLayout);
    }

    public void setData(ChildrenItem childrenItem, RecyclerViewClickListener recyclerViewClickListener) {
        ImageLoader.loadImage(view, imgaveView, childrenItem.getChildren().get(0).getSource().web);
        if (childrenItem.getParameters().getDescription() == null || childrenItem.getParameters().getDescription().equals("")) {
            textView.setVisibility(View.GONE);
        } else {
            textView.setVisibility(View.VISIBLE);
            textView.setText(childrenItem.getParameters().getDescription());
        }
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewClickListener.OnItemListClicked("shoes.json");
            }
        });

    }
}
