package com.cogent.practice;

public class FindBiggerNum {
	
	public static void main(String args[]) {
		int x = 11;
		int y = 10;
		
		if (x > y) {
			System.out.println(x + " is the largest number");//X is the largest number
		}
		else if (y > x) {
			System.out.println(y + " is the largest number");//Y is the largest number
		}
		else {
			System.out.println("The numbers " + x + " and " + y + " are equal to each other");
		}
	}
}
