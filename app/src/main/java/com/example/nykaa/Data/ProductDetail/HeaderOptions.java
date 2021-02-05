package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class HeaderOptions{

	@SerializedName("showHamburger")
	private boolean showHamburger;

	@SerializedName("showBack")
	private boolean showBack;

	@SerializedName("showLogo")
	private boolean showLogo;

	@SerializedName("showBottomBorder")
	private boolean showBottomBorder;

	@SerializedName("showSearch")
	private boolean showSearch;

	@SerializedName("showCart")
	private boolean showCart;

	@SerializedName("headerMerge")
	private boolean headerMerge;

	@SerializedName("showDiscount")
	private boolean showDiscount;

	public boolean isShowHamburger(){
		return showHamburger;
	}

	public boolean isShowBack(){
		return showBack;
	}

	public boolean isShowLogo(){
		return showLogo;
	}

	public boolean isShowBottomBorder(){
		return showBottomBorder;
	}

	public boolean isShowSearch(){
		return showSearch;
	}

	public boolean isShowCart(){
		return showCart;
	}

	public boolean isHeaderMerge(){
		return headerMerge;
	}

	public boolean isShowDiscount(){
		return showDiscount;
	}
}