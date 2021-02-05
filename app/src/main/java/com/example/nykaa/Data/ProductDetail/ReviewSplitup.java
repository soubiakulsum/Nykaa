package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class ReviewSplitup{

	@SerializedName("0")
	private JsonMember0 jsonMember0;

	@SerializedName("1")
	private JsonMember1 jsonMember1;

	@SerializedName("2")
	private JsonMember2 jsonMember2;

	@SerializedName("3")
	private JsonMember3 jsonMember3;

	@SerializedName("4")
	private JsonMember4 jsonMember4;

	@SerializedName("total_count")
	private int totalCount;

	@SerializedName("aggregated")
	private String aggregated;

	public JsonMember0 getJsonMember0(){
		return jsonMember0;
	}

	public JsonMember1 getJsonMember1(){
		return jsonMember1;
	}

	public JsonMember2 getJsonMember2(){
		return jsonMember2;
	}

	public JsonMember3 getJsonMember3(){
		return jsonMember3;
	}

	public JsonMember4 getJsonMember4(){
		return jsonMember4;
	}

	public int getTotalCount(){
		return totalCount;
	}

	public String getAggregated(){
		return aggregated;
	}
}