package com.example.nykaa.Data.ModelClass;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WidgetDataModel implements Serializable {

	@SerializedName("wid")
	private String wid;

	@SerializedName("positionInParent")
	private int positionInParent;

	@SerializedName("parameters")
	private ParametersModel parameters;

	@SerializedName("children")
	private List<ChildrenModel> children;

	@SerializedName("wtype")
	private String wtype;

	public String getWid(){
		return wid;
	}

	public int getPositionInParent(){
		return positionInParent;
	}

	public ParametersModel getParameters(){
		return parameters;
	}

	public List<ChildrenModel> getChildren(){
		return children;
	}

	public String getWtype(){
		return wtype;
	}
}