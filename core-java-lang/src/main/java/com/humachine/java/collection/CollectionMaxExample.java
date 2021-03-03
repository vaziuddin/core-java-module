package com.humachine.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(20, 10, 100, 140, 250, 234);
		Integer max = Collections.max(list);
		System.out.println("Maximum element is: "+max);

	}

}
