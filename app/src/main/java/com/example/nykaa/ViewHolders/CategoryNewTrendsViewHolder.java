package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.NameModelClass;
import com.example.nykaa.R;

public class CategoryNewTrendsViewHolder extends RecyclerView.ViewHolder {

    private ImageView ivNewTrends;
    private ImageView ivNewTrends2;


    public CategoryNewTrendsViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivNewTrends = itemView.findViewById(R.id.ivNewTrends);
        ivNewTrends2 = itemView.findViewById(R.id.ivNewTrends2);
    }

    public void setTrendsData(NameModelClass nameModelClass){
        ivNewTrends.setImageResource(nameModelClass.getIvNewTrends());
        ivNewTrends2.setImageResource(nameModelClass.getIvNewTrends2());
    }
}
