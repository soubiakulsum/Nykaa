package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.NameModelClass;
import com.example.nykaa.R;

public class CategoryNewStylesViewHolder extends RecyclerView.ViewHolder {

    private TextView tvStylesFrom;
    private ImageView ivBrandName;
    private ImageView ivBrandName2;

    public CategoryNewStylesViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        tvStylesFrom = itemView.findViewById(R.id.tvStylesFrom);
        ivBrandName = itemView.findViewById(R.id.ivBrandName);
        ivBrandName2 = itemView.findViewById(R.id.ivBrandName2);
    }

    public void setNewStylesData(NameModelClass nameModelClass){

    }
}
