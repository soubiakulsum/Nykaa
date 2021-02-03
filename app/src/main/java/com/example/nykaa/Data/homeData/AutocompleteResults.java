package com.example.nykaa.Data.homeData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class AutocompleteResults{

	@SerializedName("suggestions")
	private List<Object> suggestions;

	@SerializedName("term")
	private String term;

	@SerializedName("message")
	private String message;

	public List<Object> getSuggestions(){
		return suggestions;
	}

	public String getTerm(){
		return term;
	}

	public String getMessage(){
		return message;
	}
}