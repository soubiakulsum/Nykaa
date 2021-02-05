package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nykaa.R;

public class CardItemActivity extends AppCompatActivity {

    ImageView mIvProductItemImage;
    TextView  mtvProductDetails;
    TextView mtvCardItems;
    TextView mtvProductPrice;
    TextView mtvProductDiscount;
    TextView mtvLeft;
    TextView mtvDimension;
    TextView mtvEstimation;
    TextView mtvTotalPrice;
    TextView mtvTotalDiscountPrice;
    TextView mtvTextView20;
    TextView mtvTextView22;
    TextView mtvShippingPrice;
    TextView mtvGrandTotalPrice;
    ImageView ivButtonRemove;
    TextView tvTextView27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_item);

        mIvProductItemImage=findViewById(R.id.ivProductImage);
        mtvProductDetails=findViewById(R.id.tvProductDetails);
        mtvProductPrice=findViewById(R.id.tvProductPrice);
        mtvProductDiscount=findViewById(R.id.tvProductDiscount);
        mtvLeft=findViewById(R.id.tvLeft);
        mtvDimension=findViewById(R.id.tvDimensions);
        mtvEstimation=findViewById(R.id.tvEstimation);
        mtvTotalPrice=findViewById(R.id.tvTotalPrice);


        mtvTotalDiscountPrice=findViewById(R.id.tvDiscountPrice);
        mtvTextView20=findViewById(R.id.textView20);
        mtvTextView22=findViewById(R.id.textView22);
        mtvShippingPrice=findViewById(R.id.tvShippingPrice);
        mtvGrandTotalPrice=findViewById(R.id.tvGrandTotalPrice);
        ivButtonRemove=findViewById(R.id.Remove);
        tvTextView27=findViewById(R.id.textView27);


    }

    public void RemoveItem(View view) {

        mIvProductItemImage.setVisibility(View.GONE);
        mtvProductDetails.setVisibility(View.GONE);
        mtvProductPrice.setVisibility(View.GONE);
        mtvProductDiscount.setVisibility(View.GONE);
        mtvLeft.setVisibility(View.GONE);
        mtvDimension.setVisibility(View.GONE);
        mtvEstimation.setVisibility(View.GONE);

        tvTextView27.setText("0");

        mtvTextView20.setText("0");
        mtvTotalDiscountPrice.setText("0");
        mtvTotalPrice.setText("0");
        mtvGrandTotalPrice.setText("0");
        mtvTextView22.setText("0");
        mtvShippingPrice.setText("0");
        mtvGrandTotalPrice.setText("0");
        ivButtonRemove.setVisibility(View.GONE);


    }
}