package collection_list_package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator_with_hasNext {

	public static void main(String[] args) {
		List a1 = new ArrayList();
		a1.add(23456);
		a1.add("nazrin");
		a1.add(43);
		a1.add(20.5);
		
		Iterator a2 = a1.iterator();
		while(a2.hasNext())              //it check if the element is present or not
		{
			System.out.println(a2.next());   // it will print the object
		}

		System.out.println("Using listIterator"); 
		
		ListIterator a3 = a1.listIterator();
		while(a3.hasNext())              
		{
			System.out.println(a3.next());   //forward iteration
		}
		while(a3.hasPrevious())           
			System.out.println(a3.previous());   //backward iteration
		}
	

}
