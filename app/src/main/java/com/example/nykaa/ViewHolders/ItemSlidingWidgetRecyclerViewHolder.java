package com.example.nykaa.ViewHolders;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.nykaa.Data.homeData.ChildrenItem;
import com.example.nykaa.Data.homeStuff.childd;
import com.example.nykaa.HelperClass.ImageLoader;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

public class ItemSlidingWidgetRecyclerViewHolder extends RecyclerView.ViewHolder {
    public ItemSlidingWidgetRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private ImageView image;
    private TextView text;
    private LinearLayout linearLayout;
    private View view;

    private void initViews(View itemView) {
        view = itemView;
        image = itemView.findViewById(R.id.image);
        text = itemView.findViewById(R.id.text);
        linearLayout = itemView.findViewById(R.id.linearLayout);
    }

    public void SetData(ChildrenItem childrenItem, RecyclerViewClickListener recyclerViewClickListener) {

        if (!childrenItem.getParameters().getTitlePlain().equals("")) {
            text.setText(childrenItem.getParameters().getTitlePlain());
        } else {
            text.setText(childrenItem.getParameters().getDescription());
        }


        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewClickListener.OnItemListClicked("watches.json");
            }
        });

        String url = childrenItem.getChildren().get(0).source.web;
        if (url.charAt(url.length() - 1) == 'f' && url.charAt(url.length() - 2) == 'i' && url.charAt(url.length() - 2) == 'i') {
            Glide.with(view.getContext()).asGif().load(childrenItem.getChildren().get(0).source.web).into(image);
        } else {
            Glide.with(view.getContext()).load(childrenItem.getChildren().get(0).source.web).placeholder(new ColorDrawable(ImageLoader.getRandomColor())).into(image);
        }


    }


}
