package oop_package;

public class TypeCasting {

	public static void main(String[] args) {
		//widening
		int a1 = 100;
		double a2 = a1;  //implicite
		System.out.println(a2);
		
		int a3 = 200;
		double a4 = (double) a3;  //explicite
		System.out.println(a4);
		
		//narrowing
		double wt = 47.6;
		int newwt = (int) wt;  //explicte
		System.out.println(newwt);

	}

}
