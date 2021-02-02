package com.example.nykaa.Data.homeData;

import com.google.gson.annotations.SerializedName;

public class Router{

	@SerializedName("action")
	private String action;

	@SerializedName("location")
	private Location location;

	public String getAction(){
		return action;
	}

	public Location getLocation(){
		return location;
	}
}