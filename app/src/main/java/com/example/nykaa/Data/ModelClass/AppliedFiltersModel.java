package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class AppliedFiltersModel implements Serializable {

	@SerializedName("PageSize")
	private int pageSize;

	@SerializedName("sort")
	private String sort;

	public int getPageSize(){
		return pageSize;
	}

	public String getSort(){
		return sort;
	}
}