package basics_of_java;

public class Logical_Operator_OR {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;
		
		if(b==6 || b==a)  //F or F
		{
			System.out.println("If Block 1");
		}
		if(b==6 || b==10)  //F or T
		{
			System.out.println("If Block 2");
		}

	}

}
