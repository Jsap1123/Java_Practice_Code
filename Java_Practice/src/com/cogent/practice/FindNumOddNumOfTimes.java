package com.cogent.practice;

import java.util.HashMap;

public class FindNumOddNumOfTimes {
	static int getOddOccurence(int arr[], int n) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		//Store elements into hash map
		for (int i = 0; i < n; i++) {
			if (hmap.containsKey(arr[i])) {
				int value = hmap.get(arr[i]);
				
				//Increase the count of the element if it is already present in array
				hmap.put(arr[i], value + 1);
			}
			else {
				//If element is not present in the array, put into hash map and initialize count to 1
				hmap.put(arr[i], 1);
			}
		}
		//For loop checks for odd occurrences in hash map 
		for (Integer a:hmap.keySet()) {
			if (hmap.get(a) % 2 != 0) {
				return a;
			}
		}
		return - 1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,3,1,3};
		int n = arr.length;
		System.out.println(getOddOccurence(arr, n));
	}
}
