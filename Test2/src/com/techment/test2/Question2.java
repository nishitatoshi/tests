package com.techment.test2;

public class Question2 {

	public static void main(String[] args) {
		String string;
		repeatEnd("Hello", 3);
		repeatEnd("Hello", 2);
		repeatEnd("Hello", 1);


	}
	public static void repeatEnd(String string, int n)
	{
		for(int i=0 ; i<n; i++)
		{
			System.out.print(string.substring(string.length()-n, string.length()));
		}
		System.out.println(" ");
	}

}
