package collection_list_package;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class List_Hierchy{

	public static void main(String[] args) {
        //ArrayList
		ArrayList a1 = new ArrayList();
		a1.add(23456);
		a1.add("nazrin");
		a1.add(43);
		a1.add(null);
		a1.add(43);
		a1.add(true);
		a1.add("Story to tell");
		a1.add(56.789);
		a1.add(null);
		a1.add('c');
		System.out.println("ArrayList :"+a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(20);
		a2.add(10);
		a2.add(50);
		a2.add(45);
		System.out.println("Before Sort : " +a2);
		Collections.sort(a2);
		System.out.println(a2);
		
		
        //Vector
		Vector a3 = new Vector();
		a3.add(23456);
		a3.add("nazrin");
		a3.add(43);
		a3.add(null);
		a3.add(43);
		a3.add(true);
		a3.add("Story to tell");
		a3.add(56.789);
		a3.add(null);
		a3.add('c');
		System.out.println("Vector :"+a3);
		
		Vector a4 = new Vector();
		a4.add(20);
		a4.add(10);
		a4.add(50);
		a4.add(45);
		System.out.println("Before Sort : " +a4);
		Collections.sort(a4);
		System.out.println(a4);		

        //LinkedList
		LinkedList a5 = new LinkedList();
		a5.add(23456);
		a5.add("nazrin");
		a5.add(43);
		a5.add(null);
		a5.add(43);
		a5.add(true);
		a5.add("Story to tell");
		a5.add(56.789);
		a5.add(null);
		a5.add('c');
		System.out.println("LinkedList :"+a5);
		
		LinkedList a6 = new LinkedList();
		a6.add(20);
		a6.add(10);
		a6.add(50);
		a6.add(45);
		System.out.println("Before Sort : " +a6);
		Collections.sort(a6);
		System.out.println(a6);		
		
        //Stack
		Stack a7 = new Stack();
		a7.add(23456);
		a7.add("nazrin");
		a7.add(43);
		a7.add(null);
		a7.add(43);
		a7.add(true);
		a7.add("Story to tell");
		a7.add(56.789);
		a7.add(null);
		a7.add('c');
		System.out.println("Stack :"+a7);
		
		Stack a8 = new Stack();
		a8.add(20);
		a8.add(10);
		a8.add(50);
		a8.add(45);
		System.out.println("Before Sort : " +a8);
		Collections.sort(a8);
		System.out.println(a8);		
		

	}

}

