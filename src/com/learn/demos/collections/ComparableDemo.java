package com.learn.demos.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	
	public static void main(String[] args) {
		
	
	
	Employee p1 = new Employee(10, "Aniket!!");
	Employee p2 = new Employee(20, "Pravin!!");
	Employee p3 = new Employee(15, "Akshay");
	Employee p4 = new Employee(15, "Jo");

	
	List<Employee> personList = new ArrayList<Employee>();
	personList.add(p1);
	personList.add(p2);
	personList.add(p3);
	personList.add(p4);
	
	System.out.println("List before sort :: " + personList);
	Collections.sort(personList);
	System.out.println("List after sort :: " + personList);
	
	}
}


class Employee implements Comparable<Employee>{

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + " : "+age;
	}

	@Override
	public int compareTo(Employee o) {
		return this.age > o.getAge() ? 1:-1;
	}

}

