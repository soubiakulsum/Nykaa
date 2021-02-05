package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.CompanyModels;
import com.example.nykaa.Data.ModelClass.LuxeModel;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.OnCompanyItemClickListeners;

public class LuxeHolder extends RecyclerView.ViewHolder {

    TextView mtvLuxeList;

    OnCompanyItemClickListeners companyItemClickListeners;


    public LuxeHolder(@NonNull View itemView) {
        super(itemView);


        initViews(itemView);
    }

    private void initViews(View itemView) {

        mtvLuxeList = itemView.findViewById(R.id.LuxeList);
    }

    public void setModel(LuxeModel luxeModel) {

        mtvLuxeList.setText(luxeModel.getLuxeList());

    }
}
