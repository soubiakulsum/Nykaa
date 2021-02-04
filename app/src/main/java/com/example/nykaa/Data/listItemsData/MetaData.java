package com.example.nykaa.Data.listItemsData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MetaData{

	@SerializedName("keywords")
	private List<Object> keywords;

	@SerializedName("description")
	private String description;

	@SerializedName("title")
	private String title;

	public List<Object> getKeywords(){
		return keywords;
	}

	public String getDescription(){
		return description;
	}

	public String getTitle(){
		return title;
	}
}