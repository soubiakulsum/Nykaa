package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.LuxeModel;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.LuxeHolder;

import java.util.ArrayList;
import java.util.List;

public class LuxeAdapter extends RecyclerView.Adapter<LuxeHolder> {

    List<LuxeModel> luxeModels = new ArrayList<>();

    public LuxeAdapter(List<LuxeModel> luxeModels) {
        this.luxeModels = luxeModels;
    }

    @NonNull
    @Override
    public LuxeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.luxe_items,parent,false);
        return new LuxeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LuxeHolder holder, int position) {

        LuxeModel model =luxeModels.get(position);

        holder.setModel(model);

    }

    @Override
    public int getItemCount() {
        return luxeModels.size();
    }
}
