package com.usa.java.practice;

public class My2ndTest {
	double salary;
	String name;
	String info;
	
	public void getSalary() {
		salary = 8000.50; 
		name = " Mukta ";
		info = "123-23-4567";
		System.out.println(salary+name+info);
	}
	public void getName() {
	    salary = 9000.01; 
		name = " Imon ";
		info = "123-23-4578";
		System.out.println(salary+name+info);
	}
	public void getInfo() {
		salary = 7000.34; 
		name = " Israt ";
		info = "123-65-1284";
		System.out.println(salary+name+info);
	}
	public static void main(String[] args) {
		My2ndTest obj = new My2ndTest();
		obj.getSalary();
		obj.getInfo();
		obj.getName();
	}
}
