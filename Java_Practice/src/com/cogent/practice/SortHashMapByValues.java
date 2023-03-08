package com.cogent.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortHashMapByValues {
	
	public static HashMap<Integer, String> sortByValues(HashMap<Integer, String> hm){
		//Convert HashMap to List
		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());
		
		//Sort the List
		Collections.sort(list, (v1, v2) -> v1.getValue().compareTo(v2.getValue()));
		
		//Convert Sorted List to HashMap
		HashMap<Integer, String> temp = new LinkedHashMap<>();
		for (Map.Entry<Integer, String> thm : list) {
			temp.put(thm.getKey(), thm.getValue());
		}
		return temp;
	}

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Jean");
		hm.put(2, "Ben");
		hm.put(7, "Frank");
		hm.put(3, "David");
		hm.put(8, "David");
		hm.put(4, "Alex");
		hm.put(5, "Dan");
		hm.put(6, "Mike");
		
		System.out.println(hm);
		Map<Integer, String> sortedHashMap = sortByValues(hm);
		System.out.println(sortedHashMap);
		
	}

}
