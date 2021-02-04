package com.example.nykaa.Data.listItemsData;

import com.google.gson.annotations.SerializedName;

public class ValuesItem{

	@SerializedName("score")
	private int score;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public int getScore(){
		return score;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}
}