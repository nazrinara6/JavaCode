package basics_of_java;

public class If_Else_If_2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a<b)  //true, only the first condition will execute // one output for if-else-if
		{
			System.out.println("1");
		}
		else if(b<c)  //true
		{
			System.out.println("2");
		}
		else 
		{
		    System.out.println("3");
	    }

	}

}
