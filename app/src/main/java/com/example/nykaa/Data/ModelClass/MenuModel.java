package com.example.nykaa.Data.ModelClass;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class MenuModel implements Serializable {

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isError")
	private boolean isError;

	@SerializedName("data")
	private List<DataModel> data;

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsError(){
		return isError;
	}

	public List<DataModel> getData(){
		return data;
	}
}