package com.example.nykaa.Data.ModelClass;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class AutocompleteResultsModel implements Serializable {

	@SerializedName("suggestions")
	private List<Object> suggestions;

	@SerializedName("message")
	private String message;

	@SerializedName("term")
	private String term;

	public List<Object> getSuggestions(){
		return suggestions;
	}

	public String getMessage(){
		return message;
	}

	public String getTerm(){
		return term;
	}
}