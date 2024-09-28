package basics_of_java;

public class Final_Variable {
	
	final static double pi = 3.14;  //global final variable
	
	static void area()
	{
		// pi = 5.14; we can't update a final variable
		
		int r = 7;  //local final variable
		double area = pi*r*r;
		System.out.println(area);		

	}
    public static void main(String[] args) {
		area();
		
		final int leapyear = 366;
		// leapyear =365; can't update a final variable
		System.out.println(leapyear);

	}

}
