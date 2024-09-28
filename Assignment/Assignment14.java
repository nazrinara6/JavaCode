package core_java_assignment;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		//Area of a Triangle
		
	    Scanner s4 = new Scanner(System.in);
		System.out.println("Enter the value of b:");
		double b = s4.nextDouble();
		System.out.println("Enter the value of h:");
		double h = s4.nextDouble();
		double areaoftriangle = 0.5*b*h;
		System.out.println("Area of Triangle="+areaoftriangle);		

	}

}
