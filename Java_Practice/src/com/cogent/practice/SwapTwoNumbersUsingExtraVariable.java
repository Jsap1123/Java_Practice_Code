package com.cogent.practice;

public class SwapTwoNumbersUsingExtraVariable {
	
	public static void main(String[] args) {
		int x = 1, y = 2;
		System.out.println("Before Swap: x = " + x + " y = " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After Swap: x = " + x + " y = " + y);
	}
	
}
