package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class RouterModel implements Serializable {

	@SerializedName("location")
	private LocationModel location;

	@SerializedName("action")
	private String action;

	public LocationModel getLocation(){
		return location;
	}

	public String getAction(){
		return action;
	}
}