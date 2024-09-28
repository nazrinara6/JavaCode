package core_java_assignment;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		//Area of a Rectangle
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the value of l:");
		double l = s2.nextDouble();
		System.out.println("Enter the value of b:");
		double b = s2.nextDouble();
		double areaofrectangle = l*b;
		System.out.println("Area of Rectangle="+areaofrectangle);

	}

}
