package com.usa.java.practice;

public class GlobalVariable {
	static int salary;
	static String name;
	static String info;
	
	public void getID() {
		salary = 11000;
		name = " Sumaya ";
		info = " 12345656 ";
		System.out.println(salary+name+info);
	}
	public void getAddress() {
		salary = 8500;
		name = " Mukta ";
		info = " 486424578 ";
		System.out.println(salary+name+info);
	}
	public void getEducation() {
		salary = 9500;
		name = " Rakib ";
		info = " 234679787 ";
		System.out.println(salary+name+info);	
	}
	public static void main(String[] args) {
		GlobalVariable obj = new GlobalVariable();
		obj.getAddress();
		obj.getEducation();
		obj.getID();
	}

}
