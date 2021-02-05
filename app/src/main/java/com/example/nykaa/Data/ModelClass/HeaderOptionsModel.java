package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class HeaderOptionsModel implements Serializable {

	@SerializedName("showDiscount")
	private boolean showDiscount;

	@SerializedName("showHamburger")
	private boolean showHamburger;

	@SerializedName("showBack")
	private boolean showBack;

	@SerializedName("showLogo")
	private boolean showLogo;

	@SerializedName("showSearch")
	private boolean showSearch;

	@SerializedName("showCart")
	private boolean showCart;

	@SerializedName("headerMerge")
	private boolean headerMerge;

	@SerializedName("showBottomBorder")
	private boolean showBottomBorder;

	public boolean isShowDiscount(){
		return showDiscount;
	}

	public boolean isShowHamburger(){
		return showHamburger;
	}

	public boolean isShowBack(){
		return showBack;
	}

	public boolean isShowLogo(){
		return showLogo;
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

	public boolean isShowBottomBorder(){
		return showBottomBorder;
	}
}