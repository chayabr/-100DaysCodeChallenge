package com.vc;

public class LinearSearch {
	 public static int linearSearch(int[] arr, int target) {
		 for(int i=0; i< arr.length; i++) {
			 if(arr[i] == target) {
				 return i;
			 }
		 }
		 return -1;
	 }

public static void main(String[]args) {
	int [] numbers = {24,28,92,43,61};
	int target = 43;
	int result = linearSearch(numbers, target);
	
	if(result == -1) {
		System.out.println("Element not fount in the array.");
	}
	else {
		System.out.println("Element found at index:"+result);
	}
}
}
