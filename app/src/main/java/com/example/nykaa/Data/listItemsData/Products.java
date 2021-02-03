package com.example.nykaa.Data.listItemsData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Products{

	@SerializedName("1")
	private List<JsonMember1Item> jsonMember1;

	public List<JsonMember1Item> getJsonMember1(){
		return jsonMember1;
	}
}