package com.cogent.practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindMinMaxListUsingStream {
	public static void main(String[] args) {
		/*
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(22);
		list.add(12);
		list.add(13);
		list.add(50);
		list.add(24);
		Integer max = list.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
		Integer min = list.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);
		Integer average = (int)list.stream().mapToInt(v -> v).average().orElseThrow(NoSuchElementException::new);
		
		System.out.println(max);
		System.out.println(min);
		
		System.out.println(average);
		*/
		Queue<Integer> q = new PriorityQueue<>();
		
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.push(1);
		ad.push(2);
		ad.push(3);
		ad.poll();
		ad.poll();
		//ad.pop
		//System.out.println(ad);
		
		System.out.println(ad);
	}
}
