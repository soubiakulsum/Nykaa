package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DetailsModel implements Serializable {

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isFetchingError")
	private boolean isFetchingError;

	@SerializedName("isNotFound")
	private boolean isNotFound;

	@SerializedName("errorSKU")
	private String errorSKU;

	@SerializedName("fetchingSKU")
	private String fetchingSKU;

	@SerializedName("isFetchingAplusDataProgress")
	private boolean isFetchingAplusDataProgress;

	@SerializedName("isFetchingAplusDataError")
	private boolean isFetchingAplusDataError;

	@SerializedName("reviews")
	private ReviewsModel reviews;

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsFetchingError(){
		return isFetchingError;
	}

	public boolean isIsNotFound(){
		return isNotFound;
	}

	public String getErrorSKU(){
		return errorSKU;
	}

	public String getFetchingSKU(){
		return fetchingSKU;
	}

	public boolean isIsFetchingAplusDataProgress(){
		return isFetchingAplusDataProgress;
	}

	public boolean isIsFetchingAplusDataError(){
		return isFetchingAplusDataError;
	}

	public ReviewsModel getReviews(){
		return reviews;
	}
}