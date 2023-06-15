package com.hashmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> map= new HashMap<>();
		map.put("Amar", "123");
		map.put("Satya", "234");
		map.put("Pravin", "423");
		map.put("Datta", "523");
		
		map.forEach((x,y)-> System.out.println(x+ " + " +y));
		

	}

}
