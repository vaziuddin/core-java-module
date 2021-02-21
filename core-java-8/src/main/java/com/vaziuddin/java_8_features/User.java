package com.vaziuddin.java_8_features;

import java.util.Optional;

public class User {
	
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User() {
		
	}

	public User(String name, int age) {
		
		this.name = name;
		this.age =age;
	}
	public static boolean isRealUser(User user) {
		return true;
	}
	
	public String getOrThrow() {
		
		String value = null;
		Optional<String> valueOpt =Optional.ofNullable(value);
		String result = valueOpt.orElseThrow(CustomException::new).toUpperCase();
		return result;
	}
	
}
