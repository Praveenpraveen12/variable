package com.variable;

public class Demo 
{	
	static String name = "praveen";
	
	int roll_no = 33;
	
	public static void main(String args[])
	{
		int age = 10;
		
		System.out.println("local variable :" + age);
		System.out.println("static  variable: " + Demo.name);
		
		Demo d = new Demo();
		System.out.println("instance variable: " +d.roll_no);
		
	}
}
