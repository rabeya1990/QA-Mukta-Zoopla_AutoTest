package com.usa.java.practice;

public class MyFirstJava {
	int salary = 5000;
	String name = " Mukta ";
	String info = " 123-12-12345 ";
	
	public void getSalary() {
		System.out.println(salary+name+info);
	}
	public void getName() {
		System.out.println(salary+name+info);
	}
	public void getInfo() {
		System.out.println(salary+name+info);
	}
	
	public static void main(String[] args) {
		MyFirstJava obj = new MyFirstJava();
		obj.getInfo();
		obj.getName();
		obj.getSalary();
	}

}
