package com.cogent.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fibonacci2 {
	//Iterative Program
	
	public static void main(String[] args) {
		int n = 6;
		
		fibonacci(n);
	}

	private static void fibonacci(int n) {
		long num1 = 0, num2 = 1;
		int count = 0;
		StringBuilder sb = new StringBuilder();
		
		//Iterate through each fibonacci number until the nth number is found
		while(count <= n) {
			//Append each number found into StringBuilder
			sb.append(num1 + " ");
			
			//Print numbers in sequence until n
			//System.out.print(num1 + " ");
			
			//Swap numbers
			long num3 = num2 + num1; 
			num1 = num2; 
			num2 = num3; 
			count = count + 1;		
			
		}
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("fibonacci.txt");
			String s = sb.toString();
			byte b[] = s.getBytes();
			fos.write(b);
			System.out.println("Success");
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Issue writing to file");
			e.printStackTrace();
		} 
		
	}

}
