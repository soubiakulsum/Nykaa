package com.example.nykaa.Data.ModelClass;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ReviewsModel implements Serializable {

	@SerializedName("data")
	private List<Object> data;

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isError")
	private boolean isError;

	@SerializedName("page")
	private int page;

	public List<Object> getData(){
		return data;
	}

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsError(){
		return isError;
	}

	public int getPage(){
		return page;
	}
}