package com.cogent.practice;

public class Fibonacci {
	//Recursive Program
	
	//Stores fibonacci numbers that have already been calculated
	private static long[] fibonacciCache;
	
	public static void main(String[] args) {
		//Number in fibonacci sequence
		int n = 9;
		
		//Initialize the array
		fibonacciCache = new long[n + 1];
		
		//Prints the value of the number in fibonacci sequence
		//System.out.println(fibonacci(n));
		
		for (int i = 0; i <= n; i++) {
			//Prints the value of the numbers in fibonacci sequence until n is reached
			System.out.print(fibonacci(i) + " ");
		}
	}

	private static long fibonacci(int n) {
		//Base case for fibonacci sequence
		if (n <= 1) {
			return n;
		}
		
		if (fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		
		//Logic for finding nth fibonacci number
		long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
		
		//Stores calculated fibonacci number in array
		fibonacciCache[n] = nthFibonacciNumber;
		
		return nthFibonacciNumber;
	}

}
