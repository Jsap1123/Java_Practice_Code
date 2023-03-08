package com.cogent.practice;

import java.util.Arrays;

public class CheckIfArraysAreEqual {
	public static boolean compareArrays(int arr1[], int arr2[]) {
		int a1 = arr1.length;
		int a2 = arr2.length;
		
		//Checks if the length of each array is equal
		if (a1 != a2) {
			return false;
		}
		
		//Sorting each array
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//Traversing the array
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {5,4,3,2,1};
		
		if (compareArrays(arr1, arr2)) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}
}
