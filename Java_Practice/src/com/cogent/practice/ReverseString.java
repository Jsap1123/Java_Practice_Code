package com.cogent.practice;

import java.util.Stack;

public class ReverseString {
	public static String reverseString(String str) {
		
		int low = 0, high = 0;
		
		//Creates an empty stack
		Stack<String> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			
			//If . is found, we found a word
			if (str.charAt(i) == '.') {
				//Push each word into the stack
				stack.push(str.substring(low, high + 1));
				
				//reset low and high values for next word
				low = high = i + 1;
			}
			else {
				high = i;
			}
		}
		
		//Push the last word into the stack 
		stack.push(str.substring(low));
		
		//Construct string in LIFO order
		StringBuilder sb = new StringBuilder();
		
		while (!stack.empty()) {
			sb.append(stack.pop()).append('.');
		}
		//Removes the last . in string builder
		return sb.substring(0, sb.length() - 1);
	}
	

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
		
		System.out.println(str);
		
		System.out.println(reverseString(str));
		
	}

}
