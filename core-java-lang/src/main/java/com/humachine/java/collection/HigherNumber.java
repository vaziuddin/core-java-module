package com.humachine.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HigherNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myList = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			myList.add(i);
		}
		int highestNumber = Collections.max(myList);
		System.out.println(highestNumber);

	}

}
