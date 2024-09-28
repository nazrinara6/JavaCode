package array_class_package;

public class Array_exception {

	public static void main(String[] args) {
		
		int range[] = new int[3];
		range[0]= 23;
		range[1]= 33;
		range[2]= 22;
		range[3]= 43;
		range[4]= 26;
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(range[i]);
		}
		//ArrayIndexOutOfBoundsException

	}

}

