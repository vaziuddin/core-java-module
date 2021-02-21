package com.vaziuddin.java_8_features.groupingby;

public class Tuple {
	
	private final BlogPostType type;
	private final String author;
	
	
	public Tuple(BlogPostType type, String author) {
		//super();
		this.type = type;
		this.author = author;
	}


	public BlogPostType getType() {
		return type;
	}


	public String getAuthor() {
		return author;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tuple other = (Tuple) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (type != other.type)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Tuple {type=" + type + ", author=" + author + "}";
	}
	
	

}
