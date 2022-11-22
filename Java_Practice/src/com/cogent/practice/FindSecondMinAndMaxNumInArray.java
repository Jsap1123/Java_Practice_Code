package com.cogent.practice;

import java.util.Arrays;

public class FindSecondMinAndMaxNumInArray {
	public static void main(String[] args) {
		int[] arr = {12, 10, 7, 2, 11};
		int smallest = Integer.MAX_VALUE;
		//int largest = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];	
			}
		}
		//System.out.println(smallest);
		int second_smallest = Integer.MAX_VALUE;
        // traversing the array to find second smallest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < second_smallest
                && arr[i] > smallest) {
                second_smallest = arr[i];
            }
        }
        System.out.println("The second smallest element is " + second_smallest);
        
        Arrays.sort(arr);
        for (int i = arr.length - 2; i >= 0; i--) {
        	if (arr[i] != arr[arr.length - 1])
            {
              System.out.printf("The second largest element is " + arr[i]);
              return;
            }
		}
		//System.out.println(largest);
		/*
        int second_largest = Integer.MIN_VALUE;
        // traversing the array to find second smallest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < second_largest
                && arr[i] > largest) {
                second_largest = arr[i];
            }
        }
        //System.out.println(second_largest);
    	*/
	}
}
