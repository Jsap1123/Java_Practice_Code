package com.cogent.practice;

import java.util.Arrays;

public class CheckIfTwoArraysAreEqual {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,7,6,9,8,10};
		
		int[] arr2 = {1,2,3,4,5,8,7,9,10,6};
		//Arrays must be sorted before they are compared
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean returnVal1 = Arrays.equals(arr1,arr2);//equals method compares the elements inside each array to determine if they contain the same elements
	    System.out.println("Is Array 1 equal to Array 2: " + returnVal1);
		
		//System.out.println(arr1.equals(arr2)); //equals method compares object(memory reference) of each array object

	}

}
