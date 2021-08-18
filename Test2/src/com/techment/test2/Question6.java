package com.techment.test2;

import java.util.Scanner;

class Person extends Exception
{
	int id;
	String name;
	int age;
	Person(String str)
	  {
		super(str);
	  }
}
public class Question6 {
	private static int age;
	private static String name;

	static void validate() throws Person
	{ 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your age");
	 age = sc.nextInt();
	 {
		 if(age < 15)  
			    throw new Person("Invalid Age");  
			 else  
			    System.out.println("Valid Age");
	 }
	 System.out.println("Enter name");
	 name = sc.nextLine();
	 {
	 if(name.length()<3)
		 throw new Person("Invalid name");
	 else
		 throw new Person("Valid name");
	 }
	}  

	public static void main(String[] args) {
		
		try
		{  
		 validate();  
		}
		catch(Exception e)
		{
		  System.out.println("Caught an Exception: \n "+e);
		 }   
		 }  

	}


