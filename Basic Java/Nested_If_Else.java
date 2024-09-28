package basics_of_java;

public class Nested_If_Else {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a<b)  //true
		{
			if(b>c)  
			{
				System.out.println("1");
			}
			else   //true
			{
				if(b==a)
				{
					System.out.println("2");
				}
				else   //true
				{
				    System.out.println("4");
				}
			}
		}
		else
		{
			System.out.println("3");
		}

	}

}
