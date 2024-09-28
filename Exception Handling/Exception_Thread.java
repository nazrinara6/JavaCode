package exception_handling_package;

public class Exception_Thread {

	public static void main(String[] args) throws InterruptedException {
		
	for (int i=0;i<=10;i++)
    {		
         System.out.println(i);
         Thread.sleep(1000);  //after every execution it rest for 1second/1000ms
	}

}
}