package com.example.nykaa.Data.homeData;

import com.google.gson.annotations.SerializedName;

public class Cart{

	@SerializedName("showMobileToast")
	private boolean showMobileToast;

	@SerializedName("cartData")
	private CartData cartData;

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isFetchingError")
	private boolean isFetchingError;

	@SerializedName("cartCount")
	private int cartCount;

	@SerializedName("mobileToastText")
	private String mobileToastText;

	public boolean isShowMobileToast(){
		return showMobileToast;
	}

	public CartData getCartData(){
		return cartData;
	}

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsFetchingError(){
		return isFetchingError;
	}

	public int getCartCount(){
		return cartCount;
	}

	public String getMobileToastText(){
		return mobileToastText;
	}
}