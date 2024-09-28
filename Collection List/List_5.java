package collection_list_package;

import java.util.ArrayList;
import java.util.List;

public class List_5 {

	public static void main(String[] args) {
		List b1 = new ArrayList();
		b1.add(23456);
		b1.add(32);
		b1.add(43);
		b1.add(1900);
		System.out.println(b1);
		
		//clear
		b1.clear();
		System.out.println(b1);
		
		//isEmpty()
		boolean b2 = b1.isEmpty();
		System.out.println(b2);
		
		//contains
		

	}

}
