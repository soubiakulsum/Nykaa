package com.example.nykaa.Data.listItemsData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PopularOrTrending{

	@SerializedName("suggestions")
	private List<Object> suggestions;

	@SerializedName("message")
	private String message;

	public List<Object> getSuggestions(){
		return suggestions;
	}

	public String getMessage(){
		return message;
	}
}