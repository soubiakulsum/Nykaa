package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.CompanyModels;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.CompanyHolder;
import com.example.nykaa.clickListener.OnCompanyItemClickListeners;

import java.util.ArrayList;
import java.util.List;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyHolder> {

    List<CompanyModels> companyModels = new ArrayList<>();

    OnCompanyItemClickListeners companyItemClickListeners;

    public CompanyAdapter(List<CompanyModels> companyModels,OnCompanyItemClickListeners companyItemClickListeners) {
        this.companyModels = companyModels;
        this.companyItemClickListeners=companyItemClickListeners;
    }

    @NonNull
    @Override
    public CompanyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.company_items_view,parent,false);

        return new CompanyHolder(view,companyItemClickListeners);
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyHolder holder, int position) {

        CompanyModels models = companyModels.get(position);
        holder.setModel(models);

    }

    @Override
    public int getItemCount() {
        return companyModels.size();
    }
}
