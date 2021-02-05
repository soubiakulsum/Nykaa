package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.NewBrandsModels;
import com.example.nykaa.R;

public class NewBrandsHolder extends RecyclerView.ViewHolder {

    TextView mtvNewBrandsList;
    public NewBrandsHolder(@NonNull View itemView) {
        super(itemView);

        initViews(itemView);
    }

    private void initViews(View itemView) {

        mtvNewBrandsList=itemView.findViewById(R.id.NewBrandsList);
    }

    public void SetData(NewBrandsModels newBrandsModels){

        mtvNewBrandsList.setText(newBrandsModels.getNewBrandsList());
    }


}
