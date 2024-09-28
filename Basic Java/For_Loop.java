package basics_of_java;

public class For_Loop {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) //print 0 to 2
		{
			System.out.println(i);
		}
		
		for (int j=0; j<2; j++)  //print your name 2 times
		{
			System.out.println("Nazrin");
		}
		for (int k=0; k<=9; k++)  //print your name 10 times
		{
			System.out.println("Ara");  
		}
		for(int l=0; l<11; l++)  //print 0 to 10
		{
			System.out.println(l);
		}
		for(int m=10; m>=0; m--)  //print 10 to 0
		{
			System.out.println(m);
		}
		for(int n=-5; n<=5; n++)  //print -5 to 5
		{
			System.out.println(n);
		}
		/*for(int o=0; o<=1; o--)  //print 0 to negative infinite
		{
			System.out.println(o);  //we have to terminate, otherwise it won't stop
		}
		
		for(int p=1; p>=1; p++)  //print 1 to positive infinite
		{
			System.out.println(p);
		}*/

}
}

