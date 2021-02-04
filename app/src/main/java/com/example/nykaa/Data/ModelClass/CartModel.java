package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class CartModel implements Serializable {

	@SerializedName("cartData")
	private CartDataModel cartData;

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isFetchingError")
	private boolean isFetchingError;

	@SerializedName("showMobileToast")
	private boolean showMobileToast;

	@SerializedName("mobileToastText")
	private String mobileToastText;

	@SerializedName("cartCount")
	private int cartCount;

	public CartDataModel getCartData(){
		return cartData;
	}

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsFetchingError(){
		return isFetchingError;
	}

	public boolean isShowMobileToast(){
		return showMobileToast;
	}

	public String getMobileToastText(){
		return mobileToastText;
	}

	public int getCartCount(){
		return cartCount;
	}
}