package com.learn.demos.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyArrayList {

	
	static List<String> strList = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				int i = 0;
				while (i <= 10) {
					
					
					add("Word :: "+i);
					i++;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				int i = 11;
				while (i <= 20) {
					
					add("Word :: "+i);
					i++;
				}
				
			}
		});
		t2.start();
		
		
		
		
	}
	
	
	private static void add(String word){
		
			
		System.out.println(" Added :: "+word );
		strList.add(word);
	}
	
}
