package com.vaziuddin.java_8_features.groupingby;

public class BlogPost {
	
	private String title;
	private String author;
	private BlogPostType type;
	private int likes;
	
	
	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public BlogPostType getType() {
		return type;
	}


	public int getLikes() {
		return likes;
	}


	@Override
	public String toString() {
		return "BlogPost {title=" + title + ", author=" + author + ", likes=" + likes + "}";
	}


	
	
	

}
