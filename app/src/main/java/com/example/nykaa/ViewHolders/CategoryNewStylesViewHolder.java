package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.NameModelClass;
import com.example.nykaa.R;

public class CategoryNewStylesViewHolder extends RecyclerView.ViewHolder {

    private TextView TvStylesFrom;
    private ImageView ivNewStyleBrandName;
    private ImageView ivNewStyleBrandName2;

    public CategoryNewStylesViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivNewStyleBrandName = itemView.findViewById(R.id.ivNewStyleBrandName);
        ivNewStyleBrandName2 = itemView.findViewById(R.id.ivNewStyleBrandName2);


    }

    public void setNewStylesData(NameModelClass nameModelClass){
        ivNewStyleBrandName.setImageResource(nameModelClass.getIvNewStyleBrandName());
        ivNewStyleBrandName2.setImageResource(nameModelClass.getIvBrandName2());
    }
}
