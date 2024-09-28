package core_java_assignment;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		// Cicumference of a Rectangle
		
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter the value of l:");
		double l = a1.nextDouble();
		System.out.println("Enter the value of b:");
		double b = a1.nextDouble();
	    double circumferenceofrectangle = 2*(l+b);
	    System.out.println("Circumeferance of Rectangle="+circumferenceofrectangle);

	}

}
