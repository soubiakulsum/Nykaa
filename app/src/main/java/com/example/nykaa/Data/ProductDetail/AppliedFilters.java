package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class AppliedFilters{

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