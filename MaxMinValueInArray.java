package com.humachine.java.collection;

public class MaxMinValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrNumber = new int[] {50, 150, 250, 500, 160, 530};
		int maximum = maxNumber(arrNumber);
		System.out.println("Maximum value : "+maximum);
		int minimum = minNumber(arrNumber);
		System.out.println("Minimum value : "+minimum);
		int minimum2 = findMin(arrNumber);
		System.out.println("Minimum 2 Value : "+minimum2);

	}
	
	public static int maxNumber(int[] arr) {
		int maximumValue = arr[0];
		for (int a = 1; a < arr.length; a++) {
			if(arr[a]>maximumValue) {
				maximumValue = arr[a];
			}
			
		}
		return maximumValue;
	}
	
	public static int minNumber(int[] arr) {
		int minimumValue = arr[0];
		for (int a = 0; a < arr.length; a++) {
			if(arr[a]<minimumValue) {
				minimumValue=arr[a];
			}
		}
		return minimumValue;
	}
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i]) {
				min =arr[i];
			}
		}
		return min;
		
	}

}
