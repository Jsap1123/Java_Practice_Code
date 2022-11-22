package com.cogent.practice;

public class CheckNumEvenOrOdd {
	
	public static void main(String[] args) {
		int x = 11;
		String res = (x % 2 == 0) ? "The number " + x + " is even" :"The number " + x + " is odd";
		System.out.println(res);
	}
	
}
