package com.hashset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		
		for(Integer i : set){
			System.out.println(i);

		}
	}

}
