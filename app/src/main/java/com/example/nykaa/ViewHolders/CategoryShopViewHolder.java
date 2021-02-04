package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.NameModelClass;
import com.example.nykaa.R;

public class CategoryShopViewHolder extends RecyclerView.ViewHolder {

    private ImageView ivShopNew;

    public CategoryShopViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivShopNew = itemView.findViewById(R.id.ivShopNew);
    }

    public void setShopData(NameModelClass nameModelClass){
        ivShopNew.setImageResource(nameModelClass.getIvShopNew());
    }
}
