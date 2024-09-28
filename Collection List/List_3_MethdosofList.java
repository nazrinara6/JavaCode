package collection_list_package;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.spec.ChaCha20ParameterSpec;

public class List_3_MethdosofList {

	public static void main(String[] args) {
		//add
		List a1 = new ArrayList();
		a1.add(23456);
		a1.add("nazrin");
		a1.add(43);
		a1.add(20);
		a1.add(true);
		a1.add(56.789);
		System.out.println(a1); //add the single object

		//addAll
		List a2 = new ArrayList();
		a2.add("man");
		a2.add("woman");
		a2.addAll(a1);         // add all the collection
		System.out.println("addAll :"+a2);
		
		//equals
		boolean a3 = a2.equals(a1);  //check if both the objects are equal or not
		System.out.println(a3);
		
		//indexof
		System.out.println(a1.indexOf("nazrin"));
		
		//get
		System.out.println(a2.get(2));  //gets the index 2 of a2, 
		                                //as addAll so a1 will follow indexing after a2
		System.out.println(a1.get(3));  //it follow the indexing of object a1
		
		//set
		System.out.println(a2.set(1, "universe"));
		System.out.println(a2);
		
		//remove
		System.out.println("Before removing = "+a1);
		a1.remove(2);           // it remove index 2
		System.out.println("After removal of index 2 = " +a1); 
		a1.remove("nazrin");    // it remove object nazrin
		System.out.println("After removal of object nazrin = " +a1);
		//a1.remove
		
		
	}

}

