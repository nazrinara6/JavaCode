package core_java_assignment;

import java.awt.geom.Area;

public class Assign_50_local_global_final_variable {
	
	// a program with local,global,and final variable

		final static double pi = 3.14;  //global final variable
		
		static void area()
		{
			//we can't update a final variable
			
			int r = 7;  //local variable
			double area = pi*r*r;
			System.out.println(area);		

		}
	    public static void main(String[] args) {
			area();
			
			final int leapyear = 366;
			// leapyear =365; can't update a final variable
			System.out.println(leapyear);
			area();


		}

	}
