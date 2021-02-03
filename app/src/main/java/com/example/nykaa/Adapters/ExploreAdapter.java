package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.ExploreHolder;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreHolder> {
    @NonNull
    @Override
    public ExploreHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
       View view= layoutInflater.inflate(R.layout.explore_items,parent,false);

       return new  ExploreHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExploreHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
