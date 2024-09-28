package core_java_assignment;    //Area of Circle using Math.random

public class Assgnment_23 {
       
	final static double pi = Math.PI;
		
	public static void main(String[] args) {
		
      /*double r=Math.random();
		double area_of_circle = pi*r*r; */
		
	    for(int i=1;i<=10;i++)
	    {
	    	double r = Math.random();
	        System.out.println("The value of r = "+r);
	    	double area_of_circle = pi*r*r;
		    System.out.println("Area of circle "+ i +"="+area_of_circle);
	    }

	}

}
