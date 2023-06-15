package com.hashmap;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap <String, String> map = new HashMap<>();
		map.put("Amar", "100");
		map.put("Satya", "101");
		map.put("Rohan", "202");
		map.forEach((x,y)->System.out.println(x + " + " + y));
	}

}
