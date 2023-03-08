package com.cogent.practice;

public class RemoveAllWhitespace {
	
	//static void replaceAll("\\s", ""); //s is a single space in unicode
	public static void main(String[] args) {
		
		String s = "Jean     Sapini            ";
		System.out.println(s);
		
		
		System.out.println(s.replaceAll("\\s", ""));

	}

}
