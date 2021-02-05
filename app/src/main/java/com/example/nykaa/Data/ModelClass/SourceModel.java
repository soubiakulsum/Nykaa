package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class SourceModel implements Serializable {

	@SerializedName("Web")
	private String web;

	@SerializedName("Web_aspect_ratio")
	private int webAspectRatio;

	@SerializedName("Mobile")
	private String mobile;

	@SerializedName("Mobile_aspect_ratio")
	private int mobileAspectRatio;

	public String getWeb(){
		return web;
	}

	public int getWebAspectRatio(){
		return webAspectRatio;
	}

	public String getMobile(){
		return mobile;
	}

	public int getMobileAspectRatio(){
		return mobileAspectRatio;
	}
}