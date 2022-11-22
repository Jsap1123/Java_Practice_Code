package com.cogent.practice;

public class SwapTwoNumbers {
	
	public static void main(String args[]) {
		int x = 1, y = 2;
		System.out.println("Before Swap: x = " + x + " y = " + y);
		x = x + y;//X becomes 3
		y = x - y;//Y becomes 1
		x = x - y;//X becomes 2
		System.out.println("After Swap: x = " + x + " y = " + y);
	}
}
