package com.example.nykaa.Data.homeData;

import com.google.gson.annotations.SerializedName;

public class Source{

	@SerializedName("Web_aspect_ratio")
	private double webAspectRatio;

	@SerializedName("Web")
	private String web;

	public double getWebAspectRatio(){
		return webAspectRatio;
	}

	public String getWeb(){
		return web;
	}
}