package com.example.nykaa.Data.homeData;

import com.google.gson.annotations.SerializedName;

public class Details{

	@SerializedName("isFetchingAplusDataError")
	private boolean isFetchingAplusDataError;

	@SerializedName("errorSKU")
	private String errorSKU;

	@SerializedName("isNotFound")
	private boolean isNotFound;

	@SerializedName("reviews")
	private Reviews reviews;

	@SerializedName("fetchingSKU")
	private String fetchingSKU;

	@SerializedName("isFetchingAplusDataProgress")
	private boolean isFetchingAplusDataProgress;

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isFetchingError")
	private boolean isFetchingError;

	public boolean isIsFetchingAplusDataError(){
		return isFetchingAplusDataError;
	}

	public String getErrorSKU(){
		return errorSKU;
	}

	public boolean isIsNotFound(){
		return isNotFound;
	}

	public Reviews getReviews(){
		return reviews;
	}

	public String getFetchingSKU(){
		return fetchingSKU;
	}

	public boolean isIsFetchingAplusDataProgress(){
		return isFetchingAplusDataProgress;
	}

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsFetchingError(){
		return isFetchingError;
	}
}