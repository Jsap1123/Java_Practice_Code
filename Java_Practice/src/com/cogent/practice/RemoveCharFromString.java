package com.cogent.practice;

public class RemoveCharFromString {
	
	static void removeChar(String s, char c) {
		int j, count = 0, n = s.length();
	    char[] charArray = s.toCharArray();
	    for (int i = j = 0; i < n; i++)
	    {
	        if (charArray[i] != c)
	        charArray[j++] = charArray[i];
	        else
	            count++;
	    }
	     
	    while(count > 0)
	    {
	        charArray[j++] = '\0';
	        count--;
	    }
	     
	    System.out.println(charArray);
	}

	public static void main(String[] args) {
		String s = "lookout";
		System.out.println(s);
		System.out.println();
		removeChar(s, 'o');

	}

}
