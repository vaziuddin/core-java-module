package com.vaziuddin.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamFlatMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l1 = Arrays.asList("a","b");
		List<String> l2 = Arrays.asList("c", "d","e");
		
		List<String> l = new ArrayList<String>();
		
		l.addAll(l1);
		l.addAll(l2);
		
		List<String> letters = l.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		List<String> betterLetters = Stream.of(l1, l2).flatMap(List::stream).map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(letters);
		System.out.println(betterLetters);

	}

}
