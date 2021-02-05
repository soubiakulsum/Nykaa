package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class UserModel implements Serializable {

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isError")
	private boolean isError;

	@SerializedName("cartCount")
	private int cartCount;

	@SerializedName("customerData")
	private Object customerData;

	@SerializedName("formKey")
	private String formKey;

	@SerializedName("hasOptedForNewsletter")
	private String hasOptedForNewsletter;

	@SerializedName("base_location")
	private String baseLocation;

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsError(){
		return isError;
	}

	public int getCartCount(){
		return cartCount;
	}

	public Object getCustomerData(){
		return customerData;
	}

	public String getFormKey(){
		return formKey;
	}

	public String getHasOptedForNewsletter(){
		return hasOptedForNewsletter;
	}

	public String getBaseLocation(){
		return baseLocation;
	}
}