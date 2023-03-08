package com.cogent.practice;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PracticeCode_11_23 {

	public static void main(String[] args) {
		SortedSet<String> ss = new TreeSet<String>();
		//ss.add(""p"");
		ss.add("b");
		ss.add("c");
		ss.add("d");
		ss.add("f");
		ss.add("e");
		
		SortedSet<String> ss2 = ss.headSet("z");
		Iterator<String> ssitr2 = ss2.iterator();
		while(ssitr2.hasNext()) {
			System.out.println(ssitr2.next().toString());
		}

	}

}
