package com.vaziuddin.streamreduce.entities;

public class Review {
	
	int points;
	String review;
	
	
	public int getPoints() {
		return points;
	}
	public String getReview() {
		return review;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Review(int points, String review) {
		
		this.points = points;
		this.review = review;
	}
	
	

}
