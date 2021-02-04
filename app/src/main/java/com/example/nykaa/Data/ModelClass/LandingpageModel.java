package com.example.nykaa.Data.ModelClass;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class LandingpageModel implements Serializable {

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isFetchingError")
	private boolean isFetchingError;

	@SerializedName("isNotFound")
	private boolean isNotFound;

	@SerializedName("landingpageData")
	private List<LandingpageDataModel> landingpageData;

	@SerializedName("isI18n")
	private boolean isI18n;

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsFetchingError(){
		return isFetchingError;
	}

	public boolean isIsNotFound(){
		return isNotFound;
	}

	public List<LandingpageDataModel> getLandingpageData(){
		return landingpageData;
	}

	public boolean isIsI18n(){
		return isI18n;
	}
}