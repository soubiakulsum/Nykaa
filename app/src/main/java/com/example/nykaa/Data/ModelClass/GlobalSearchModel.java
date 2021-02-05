package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class GlobalSearchModel implements Serializable {

	@SerializedName("popularOrTrending")
	private PopularOrTrendingModel popularOrTrending;

	@SerializedName("autocompleteResults")
	private AutocompleteResultsModel autocompleteResults;

	@SerializedName("isAutoCompleteFetching")
	private boolean isAutoCompleteFetching;

	@SerializedName("isAutoCompleteFetchingError")
	private boolean isAutoCompleteFetchingError;

	@SerializedName("isSuggestionFailed")
	private boolean isSuggestionFailed;

	public PopularOrTrendingModel getPopularOrTrending(){
		return popularOrTrending;
	}

	public AutocompleteResultsModel getAutocompleteResults(){
		return autocompleteResults;
	}

	public boolean isIsAutoCompleteFetching(){
		return isAutoCompleteFetching;
	}

	public boolean isIsAutoCompleteFetchingError(){
		return isAutoCompleteFetchingError;
	}

	public boolean isIsSuggestionFailed(){
		return isSuggestionFailed;
	}
}