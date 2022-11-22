package com.cogent.practice;

public class FindBiggestNumAmongThree {

	public static void main(String[] args) {
		int x = 10, y = 7, z = 11;
		if (x > y && x > z) {
			System.out.println(x + " is the largest of the three numbers");
		}
		else if (y > z) {
			System.out.println(y + " is the largest of the three numbers");
		}
		else {
			System.out.println(z + " is the largest of the three numbers");
		}
	}
}
