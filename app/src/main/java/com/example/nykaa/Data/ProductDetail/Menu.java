package com.example.nykaa.Data.ProductDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Menu{

	@SerializedName("isError")
	private boolean isError;

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("isFetching")
	private boolean isFetching;

	public boolean isIsError(){
		return isError;
	}

	public List<DataItem> getData(){
		return data;
	}

	public boolean isIsFetching(){
		return isFetching;
	}
}