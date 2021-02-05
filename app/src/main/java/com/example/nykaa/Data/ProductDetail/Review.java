package com.example.nykaa.Data.ProductDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Review{

	@SerializedName("review_splitup")
	private ReviewSplitup reviewSplitup;

	@SerializedName("star_rating")
	private double starRating;

	@SerializedName("top_reviews")
	private List<TopReviewsItem> topReviews;

	@SerializedName("review_count")
	private int reviewCount;

	@SerializedName("star_rating_count")
	private int starRatingCount;

	public ReviewSplitup getReviewSplitup(){
		return reviewSplitup;
	}

	public double getStarRating(){
		return starRating;
	}

	public List<TopReviewsItem> getTopReviews(){
		return topReviews;
	}

	public int getReviewCount(){
		return reviewCount;
	}

	public int getStarRatingCount(){
		return starRatingCount;
	}
}