package basics_of_java;

public class Area_of_Circle {
	
	static double pi = 3.14;  //global variable
	
	static void area1() 
	{
		int r =7;  //local variable
		double area = pi*r*r;
		System.out.println(area);
	}
	static void area2() 
	{
		int r =17;  //local variable
		double area = pi*r*r;
		System.out.println(area);
	}
	static void area3() 
	{
		int r =23;  //local variable
		double area = pi*r*r;
		System.out.println(area);
	}
	static void area4() 
	{
		int r =16;  //local variable
		double area = pi*r*r;
		System.out.println(area);
	}
	static void area5() 
	{
		int r =14;  //local variable
		double area = pi*r*r;
		System.out.println(area);
	}
	public static void main(String[] args) {
		area1();
		area2();
		area3();
		area4();
		area5();

	}

}
