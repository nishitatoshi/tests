package com.techment.test2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for RED, 2 for YELLOW, 3 for GREEN");
		int n = scanner.nextInt();
		if(n==1)
			System.out.println("STOP");
		else if(n==2)
			System.out.println("READY");
		else if(n==3)
			System.out.println("GO");
		else
			System.out.println("wrong number, try again!");

	}

}
