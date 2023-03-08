package com.cogent.practice;

import java.util.Arrays;

public class FindThirdLargestElement {

	public static void main(String[] args) {
		int[] arr = {7,9,17,10,44,22,12,18,21,23,32};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		for (int i = arr.length - 3; i >= 0; i--) {
			/*
			if (arr[i] != arr[arr.length - 2] && arr[i] != arr[arr.length - 1]) {
				System.out.println("The third largest number is " + arr[i]);
				return;
			}
			*/
			if (arr[i] == arr[arr.length - 3]) {
				System.out.println("The third largest number is " + arr[i]);
				return;
			}
		}
		//System.out.println("The third largest number is " + arr[i]);
		

	}

}
