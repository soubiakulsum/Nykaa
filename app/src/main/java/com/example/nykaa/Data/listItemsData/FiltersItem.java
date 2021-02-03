package com.example.nykaa.Data.listItemsData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class FiltersItem{

	@SerializedName("facet_doc_count")
	private int facetDocCount;

	@SerializedName("values")
	private List<ValuesItem> values;

	@SerializedName("isSingleSelect")
	private int isSingleSelect;

	@SerializedName("is_default_filter")
	private boolean isDefaultFilter;

	@SerializedName("title")
	private String title;

	@SerializedName("type")
	private String type;

	@SerializedName("key")
	private String key;

	@SerializedName("show_search_box")
	private boolean showSearchBox;

	@SerializedName("facet_count")
	private int facetCount;

	@SerializedName("range")
	private Range range;

	public int getFacetDocCount(){
		return facetDocCount;
	}

	public List<ValuesItem> getValues(){
		return values;
	}

	public int getIsSingleSelect(){
		return isSingleSelect;
	}

	public boolean isIsDefaultFilter(){
		return isDefaultFilter;
	}

	public String getTitle(){
		return title;
	}

	public String getType(){
		return type;
	}

	public String getKey(){
		return key;
	}

	public boolean isShowSearchBox(){
		return showSearchBox;
	}

	public int getFacetCount(){
		return facetCount;
	}

	public Range getRange(){
		return range;
	}
}