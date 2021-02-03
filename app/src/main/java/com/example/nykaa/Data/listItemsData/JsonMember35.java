package com.example.nykaa.Data.listItemsData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class JsonMember35{

	@SerializedName("redirect_text")
	private String redirectText;

	@SerializedName("bg_color")
	private String bgColor;

	@SerializedName("redirect_filter")
	private String redirectFilter;

	@SerializedName("values")
	private List<ValuesItem> values;

	@SerializedName("name")
	private String name;

	@SerializedName("position")
	private List<String> position;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	public String getRedirectText(){
		return redirectText;
	}

	public String getBgColor(){
		return bgColor;
	}

	public String getRedirectFilter(){
		return redirectFilter;
	}

	public List<ValuesItem> getValues(){
		return values;
	}

	public String getName(){
		return name;
	}

	public List<String> getPosition(){
		return position;
	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}
}