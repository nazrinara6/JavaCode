package basics_of_java;

public class Logical_Operator_AND {

	public static void main(String[] args) {
	    
		int a = 10;
		int b = 20;
		
		if(a==b && b==10)  //F && F
		{
			System.out.println("If Block 1");
		}
		if(a==10 && b==20)  //T && T
		{
			System.out.println("If Block 2");
		}

	}

}
