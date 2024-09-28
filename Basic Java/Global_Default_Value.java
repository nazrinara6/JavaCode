package basics_of_java;

public class Global_Default_Value {
	
	static int a;  //as not initialised so it will assign the default value 
	static String b;
	static boolean c;
	static double d;
	int e;

	public static void main(String[] args) {
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         Global_Default_Value a3 = new Global_Default_Value();
         System.out.println(a3.e);

	}

}
