package com.example.nykaa.Data.homeData;

import com.google.gson.annotations.SerializedName;

public class Location{

	@SerializedName("search")
	private String search;

	@SerializedName("hash")
	private String hash;

	@SerializedName("key")
	private String key;

	@SerializedName("pathname")
	private String pathname;

	public String getSearch(){
		return search;
	}

	public String getHash(){
		return hash;
	}

	public String getKey(){
		return key;
	}

	public String getPathname(){
		return pathname;
	}
}