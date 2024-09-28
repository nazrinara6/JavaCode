package collection_list_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_4 {

	public static void main(String[] args) {
		
		//removeAll
		List a1 = new ArrayList();
		a1.add(23456);
		a1.add("nazrin");
		a1.add(43);
		a1.add(20.5);
		a1.add(true);
		a1.add(56.789);
		
		List a2 = new ArrayList();
		a2.add("manish");
		a2.add("ajay");
		a2.add("rama");
		a2.addAll(a1);         
		System.out.println(a2);
		
		a2.removeAll(a1);   //from a2 removeAll a1
		System.out.println(a2);
		
		//sorting
		Collections.sort(a2);  //sort by alphabetical orders
		System.out.println(a2);

	}

}
