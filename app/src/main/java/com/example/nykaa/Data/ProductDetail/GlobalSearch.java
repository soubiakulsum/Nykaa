package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class GlobalSearch{

	@SerializedName("isAutoCompleteFetching")
	private boolean isAutoCompleteFetching;

	@SerializedName("autocompleteResults")
	private AutocompleteResults autocompleteResults;

	@SerializedName("isSuggestionFailed")
	private boolean isSuggestionFailed;

	@SerializedName("popularOrTrending")
	private PopularOrTrending popularOrTrending;

	@SerializedName("isAutoCompleteFetchingError")
	private boolean isAutoCompleteFetchingError;

	public boolean isIsAutoCompleteFetching(){
		return isAutoCompleteFetching;
	}

	public AutocompleteResults getAutocompleteResults(){
		return autocompleteResults;
	}

	public boolean isIsSuggestionFailed(){
		return isSuggestionFailed;
	}

	public PopularOrTrending getPopularOrTrending(){
		return popularOrTrending;
	}

	public boolean isIsAutoCompleteFetchingError(){
		return isAutoCompleteFetchingError;
	}
}