package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.TypeModelClass;
import com.example.nykaa.Interface.TypeClickListener;
import com.example.nykaa.R;

public class TypeViewHolderClass extends RecyclerView.ViewHolder {

    private TextView tvType;
    private View vLineType;
    private TypeClickListener typeClickListener;

    public TypeViewHolderClass(@NonNull View itemView,TypeClickListener typeClickListener) {
        super(itemView);
        this.typeClickListener = typeClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {

        tvType = itemView.findViewById(R.id.tvType);
        vLineType = itemView.findViewById(R.id.vLineType);
    }

    public void setData(TypeModelClass typeModelClass) {
        tvType.setText(typeModelClass.getType());
        if (typeModelClass.getViewType() == 1){
            vLineType.setVisibility(View.VISIBLE);
        }else{
            vLineType.setVisibility(View.GONE);
        }
        tvType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeClickListener.OnTypeClicked();
            }
        });
    }
}
