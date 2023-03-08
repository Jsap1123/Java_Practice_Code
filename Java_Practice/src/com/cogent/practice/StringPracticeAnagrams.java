package com.cogent.practice;

public class StringPracticeAnagrams {
	
	static boolean isAnagram(String a, String b) {
		char[] charA = a.toCharArray();
		char[] charB = b.toCharArray();
		
		//Max number of characters stored in 8 bit
		int numOfChars = 256;
		
		int[] count = new int[numOfChars];
		
		for (int i = 0; i < charA.length; i++) {
				//Increases count of characters in first string
				count[charA[i]]++;
				//Decreases count of characters in second string
				count[charB[i]]--;
		}
		if (charA.length != charB.length) {
			return false;
		}
		
		for (int i = 0; i < numOfChars; i++) {
			//If count != 0
			//Arrays do not contain the same characters
			if (count[i] != 0) {
				return false;
			}
		}
		return true;	
		
	}

	public static void main(String[] args) {
		String a = "geeksforgeeks";
		String b = "forgeeksgeeks";
		
		if (isAnagram(a,b)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("Not an anagram");
		}

	}

}
