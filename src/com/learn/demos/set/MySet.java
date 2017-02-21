package com.learn.demos.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myList = {50, 10, 30, 20, 40, 10};
		
		
		Set<Integer> mySet1 = new TreeSet();
		//Set<Integer> mySet2 = new EnumSet();
		Set<Integer> mySet3 = new HashSet<>();
		Set<Integer> mySet4 = new LinkedHashSet<>();
		
		for (int i = 0; i < myList.length; i++) {
			
			mySet1.add(myList[i]);
			mySet3.add(myList[i]);
			mySet4.add(myList[i]);
						
		}
		
		//mySet1.add(null);
		mySet3.add(null);
		mySet4.add(null);
		
		System.out.println("Tree Set : "+ mySet1);
		System.out.println("Hash Set : "+ mySet3);
		System.out.println("Linked hash Set : "+ mySet4);
		
		
		

	}

}
