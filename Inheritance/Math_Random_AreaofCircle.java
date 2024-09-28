package inheritance_package;

import basics_of_java.Static_Method;

public class Math_Random_AreaofCircle {

	//final static double pi = 3.14;
	final static double pi = Math.PI;
	
	public static void main(String[] args) {
		 
		double r = Math.random();
		System.out.println("The value of r = "+r);
		double area_of_circle = pi*r*r;
		System.out.println(area_of_circle);

	}

}
