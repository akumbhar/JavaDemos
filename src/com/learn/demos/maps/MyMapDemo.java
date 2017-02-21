package com.learn.demos.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class MyMapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1,  "AAA");
		map1.put(2,  "BBB");
		map1.put(3,  "CCC");
		map1.put(4,  "DDD");
		map1.put(5,  null);
		map1.put(null,  "EEE");
		map1.put(null,  "ZZZ");
		System.out.println(map1);
		
		Map<Integer, String> map2 = new LinkedHashMap();
		map2.put(1,  "AAA");
		map2.put(2,  "BBB");
		map2.put(3,  "CCC");
		map2.put(4,  "DDD");
		map2.put(5,  null);
		map2.put(null,  "EEE");
		map2.put(null,  "ZZZ");
		System.out.println(map2);
		

		
		Map<Integer, String> map3 = new TreeMap<>();
		map3.put(1,  "AAA");
		map3.put(3,  "CCC");
		map3.put(5,  null);
		map3.put(2,  "BBB");
		map3.put(4,  "DDD");
		
		//map3.put(null,  "EEE");
		System.out.println(map3);
		
		
		Map<String, Integer> map4 = new TreeMap<>();
		map4.put("AAA", 3);
		map4.put("CCC", 1);
		//map4.put(null, 4);
		map4.put("EEE", 2);
		map4.put("BBB", 6);
		map4.put("DDD", 5);
		map4.put("MMM", null);
		System.out.println(map4);
		
		
		
		Hashtable<String, Integer> hTable = new Hashtable<>();
		hTable.put("AAA",10);
		hTable.put("AAA",20);
		hTable.put("BBB",60);
		hTable.put("DDD",40);
		hTable.put("CCC",50);
		hTable.put("PPP",null);
		//hTable.put("CCC",50);
		System.out.println(hTable);
	}

}
