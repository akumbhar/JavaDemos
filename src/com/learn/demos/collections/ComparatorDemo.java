package com.learn.demos.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {

		Person p1 = new Person(10, "Aniket!!");
		Person p2 = new Person(20, "Pravin!!");
		Person p3 = new Person(15, "Akshay");
		Person p4 = new Person(15, "Jo");

		
		List<Person> personList = new ArrayList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		
		System.out.println("List before sort :: " + personList);
		Collections.sort(personList, new MyComparator());
		System.out.println("List after sort :: " + personList);
	}

}

class Person {

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

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " : "+age;
	}

}

class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		return o1.getAge() > o2.getAge() ? 1:-1;
	}

}
