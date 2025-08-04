package com.vc;

public class BinarySearch {
	public static int binarySearch (int[] arr, int key) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid= start +(end - start)/2;
			
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid]<key) {
				start = mid+1;{					
					start =mid+1;					
				} 
					end = mid-1;				
				}
			}
			return -1;		
		}
	public static void main(String[]args) {
		int[] sortedArray = {23,24,35,45,56,67};
		int key =35;
		
		int result = binarySearch(sortedArray, key);
		
		if(result == -1) {
			System.out.println("Element not found in the array");
			
		}else {
			System.out.println("Element found at index:" +result);
			
		}
		
	}
}
	


