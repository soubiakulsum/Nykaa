package com.example.nykaa.Data.homeData;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("base_location")
	private String baseLocation;

	@SerializedName("isError")
	private boolean isError;

	@SerializedName("formKey")
	private String formKey;

	@SerializedName("hasOptedForNewsletter")
	private String hasOptedForNewsletter;

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("cartCount")
	private int cartCount;

	@SerializedName("customerData")
	private Object customerData;

	public String getBaseLocation(){
		return baseLocation;
	}

	public boolean isIsError(){
		return isError;
	}

	public String getFormKey(){
		return formKey;
	}

	public String getHasOptedForNewsletter(){
		return hasOptedForNewsletter;
	}

	public boolean isIsFetching(){
		return isFetching;
	}

	public int getCartCount(){
		return cartCount;
	}

	public Object getCustomerData(){
		return customerData;
	}
}