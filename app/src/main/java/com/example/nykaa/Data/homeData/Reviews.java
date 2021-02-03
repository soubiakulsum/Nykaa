package com.example.nykaa.Data.homeData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Reviews{

	@SerializedName("isError")
	private boolean isError;

	@SerializedName("data")
	private List<Object> data;

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("page")
	private int page;

	public boolean isIsError(){
		return isError;
	}

	public List<Object> getData(){
		return data;
	}

	public boolean isIsFetching(){
		return isFetching;
	}

	public int getPage(){
		return page;
	}
}