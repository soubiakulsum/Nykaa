package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.CompanyModels;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.OnCompanyItemClickListeners;

public class CompanyHolder extends RecyclerView.ViewHolder {

    TextView mtvCompanyList;

    OnCompanyItemClickListeners companyItemClickListeners;



    public CompanyHolder(@NonNull View itemView,OnCompanyItemClickListeners companyItemClickListeners) {
        super(itemView);

        this.companyItemClickListeners=companyItemClickListeners;



        initViews(itemView);
    }

    private void initViews(View itemView) {

        mtvCompanyList=itemView.findViewById(R.id.companyList);
    }

    public void setModel(CompanyModels companyModels){

        mtvCompanyList.setText(companyModels.getCompanyModels());

        mtvCompanyList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}
