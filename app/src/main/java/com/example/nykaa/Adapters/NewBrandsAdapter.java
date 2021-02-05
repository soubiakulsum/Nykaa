package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.NewBrandsModels;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.NewBrandsHolder;

import java.util.ArrayList;
import java.util.List;

public class NewBrandsAdapter extends RecyclerView.Adapter<NewBrandsHolder> {

    private List<NewBrandsModels> newBrandsModels= new ArrayList<>();

    public NewBrandsAdapter(List<NewBrandsModels> newBrandsModels) {
        this.newBrandsModels = newBrandsModels;
    }

    @NonNull
    @Override
    public NewBrandsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.items_newbrands,parent,false);


        return new NewBrandsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewBrandsHolder holder, int position) {

        NewBrandsModels models= newBrandsModels.get(position);

        holder.SetData(models);

    }

    @Override
    public int getItemCount() {
        return newBrandsModels.size();
    }
}
