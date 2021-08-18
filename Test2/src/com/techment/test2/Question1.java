package com.techment.test2;


public class Question1 {

	public static void main(String[] args) {

		String string;
		int n;
		repeatFront("Nishita", 4);
		repeatFront("Nishita", 3);
		repeatFront("Nishita", 2);
		repeatFront("Nishita", 1);


	}
	public static void repeatFront(String string, int n)
	{
		for(int i=n ; i>0; i--)
		{
			System.out.print(string.substring(0, n));
		}
		System.out.println(" ");

	}

}
