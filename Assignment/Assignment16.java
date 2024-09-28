package core_java_assignment;

import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		// Cicumference of a Circle
		
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter the value of pi:");
		double pi = a1.nextDouble();
		System.out.println("Enter the value of r:");
		double r = a1.nextDouble();
		double circumferenceofcircle = 2*pi*r;
		System.out.println("Circumeferance of Circle="+circumferenceofcircle);

	}

}
