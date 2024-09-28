package core_java_assignment;

import java.util.Scanner;

public class Assignment15 {
	//Area of a Trapezium
	
	public static void main(String[] args) {
		
    Scanner s5 = new Scanner(System.in);
	System.out.println("Enter the value of l1:");
	double l1 = s5.nextDouble();
	System.out.println("Enter the value of l2:");
	double l2 = s5.nextDouble();
	System.out.println("Enter the value of h:");
	double h = s5.nextDouble();
	double areaoftrapezium = 0.5*(l1+l2)*h;
	System.out.println("Area of Trapezium="+areaoftrapezium);	

}
}