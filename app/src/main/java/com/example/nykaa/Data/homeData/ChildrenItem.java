package com.example.nykaa.Data.homeData;

import java.util.List;

import com.example.nykaa.Data.homeStuff.childd;
import com.google.gson.annotations.SerializedName;

public class ChildrenItem{

	@SerializedName("transaction_id")
	private String transactionId;

	@SerializedName("wtype")
	private String wtype;

	@SerializedName("wid")
	private String wid;

	@SerializedName("children")
	private List<childd> children;

	@SerializedName("positionInParent")
	private int positionInParent;

	@SerializedName("parameters")
	private Parameters parameters;

	@SerializedName("source")
	private Source source;

	public String getTransactionId(){
		return transactionId;
	}

	public String getWtype(){
		return wtype;
	}

	public String getWid(){
		return wid;
	}

	public List<childd> getChildren(){
		return children;
	}

	public int getPositionInParent(){
		return positionInParent;
	}

	public Parameters getParameters(){
		return parameters;
	}

	public Source getSource(){
		return source;
	}
}