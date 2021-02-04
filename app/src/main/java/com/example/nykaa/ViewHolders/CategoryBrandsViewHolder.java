package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.NameModelClass;
import com.example.nykaa.R;

public class CategoryBrandsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvTopJustIn;
    private ImageView ivBrandsName;
    private TextView tvJustInBrands;
    private ImageView ivBrandsName2;
    private TextView tvJustInBrands2;



    public CategoryBrandsViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {

        tvTopJustIn = itemView.findViewById(R.id.tvTopJustIn);
        ivBrandsName = itemView.findViewById(R.id.ivBrandsName);
        tvJustInBrands = itemView.findViewById(R.id.tvJustInBrands);
        ivBrandsName2 = itemView.findViewById(R.id.ivBrandsName2);
        tvJustInBrands2 = itemView.findViewById(R.id.tvJustInBrands2);

    }

    public void setBrandsData(NameModelClass nameModelClass){
        ivBrandsName.setImageResource(nameModelClass.getIvNewTrends());


    }
}
