package com.cogent.practice;

public class FizzBuzz {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			
			/*
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			*/
			
			String output = "";
			
			if (i % 3 == 0) {
				output += "Fizz";
			}
			if (i % 5 == 0) {
				output += "Buzz";
			}
			if (i % 3 != 0 && i % 5 != 0) {
				output += i;
			}
			System.out.print(output + " ");
		}
	}
}
