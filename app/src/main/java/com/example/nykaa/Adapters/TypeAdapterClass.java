package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.TypeModelClass;
import com.example.nykaa.Interface.TypeClickListener;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.TypeViewHolderClass;

import java.util.List;

public class TypeAdapterClass extends RecyclerView.Adapter<TypeViewHolderClass> {

    private List<TypeModelClass>typeModelClassList;
    private TypeClickListener typeClickListener;

    public TypeAdapterClass(List<TypeModelClass> typeModelClassList,TypeClickListener typeClickListener) {
        this.typeModelClassList = typeModelClassList;
        this.typeClickListener = typeClickListener;
    }

    @NonNull
    @Override
    public TypeViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.type_layout,parent,false);
        return new TypeViewHolderClass(view,typeClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull TypeViewHolderClass holder, int position) {

        TypeModelClass typeModelClass = typeModelClassList.get(position);
        holder.setData(typeModelClass);

    }

    @Override
    public int getItemCount() {
        return typeModelClassList.size();
    }
}
