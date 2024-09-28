package core_java_assignment;

import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		//Area of a Circle
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of pi:");
		double pi = s1.nextDouble();
		System.out.println("Enter the value of r:");
		int r = s1.nextInt();
		double areaofcircle = pi*r*r;
		System.out.println("Area of Circle="+areaofcircle);

	}

}
