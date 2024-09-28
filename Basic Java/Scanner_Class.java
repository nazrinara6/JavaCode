package basics_of_java;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in); 
		//Scanner class need to import as it is java.util.package
		//System.in -> parameter - accept the request
		
		System.out.println("Enter your name:");
		String name = s1.next();
		System.out.println("What is your age?");
		byte age = s1.nextByte();
		System.out.println("What is your salary?");
		int salary = s1.nextInt();
		System.out.println("Is your ticket booked?");
		boolean ticket = s1.nextBoolean();
		System.out.println("What is your exam marks?");
		float marks = s1.nextFloat();
		System.out.println("What is the salary of elonmask?");
		long elonmasksalary = s1.nextLong();
		
	}

}
