package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class JsonMember0{

	@SerializedName("star")
	private int star;

	@SerializedName("count")
	private String count;

	@SerializedName("per")
	private double per;

	public int getStar(){
		return star;
	}

	public String getCount(){
		return count;
	}

	public double getPer(){
		return per;
	}
}