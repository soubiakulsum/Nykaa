package com.example.nykaa.Data.ProductDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Landingpage{

	@SerializedName("landingpageData")
	private List<Object> landingpageData;

	@SerializedName("isNotFound")
	private boolean isNotFound;

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isFetchingError")
	private boolean isFetchingError;

	@SerializedName("isI18n")
	private boolean isI18n;

	public List<Object> getLandingpageData(){
		return landingpageData;
	}

	public boolean isIsNotFound(){
		return isNotFound;
	}

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsFetchingError(){
		return isFetchingError;
	}

	public boolean isIsI18n(){
		return isI18n;
	}
}