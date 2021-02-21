package com.vaziuddin.streamreduce.entities;

public class User {
	
	private final String name;
	private final int age;
	private final Rating rating = new Rating();
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Rating getRating() {
		return rating;
	}
	public User(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User { name=" + name + ", age=" + age + "}";
	}
	
	
}
