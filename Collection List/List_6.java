package collection_list_package;

import java.util.ArrayList;
import java.util.List;

public class List_6 {

	public static void main(String[] args) {
		List b1 = new ArrayList();
		b1.add(23456);
		b1.add(32);
		b1.add(43);
		b1.add(1900);
		System.out.println(b1);
		
		//contains
		boolean b2 = b1.contains(32);
		System.out.println(b2);
		
		//size
		System.out.println(b1.size());
		

	}

}
