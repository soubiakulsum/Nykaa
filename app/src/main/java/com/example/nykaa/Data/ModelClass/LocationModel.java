package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class LocationModel implements Serializable {

	@SerializedName("pathname")
	private String pathname;

	@SerializedName("search")
	private String search;

	@SerializedName("hash")
	private String hash;

	@SerializedName("key")
	private String key;

	public String getPathname(){
		return pathname;
	}

	public String getSearch(){
		return search;
	}

	public String getHash(){
		return hash;
	}

	public String getKey(){
		return key;
	}
}