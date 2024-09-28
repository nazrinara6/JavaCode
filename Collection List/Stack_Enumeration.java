package collection_list_package;

import java.util.Enumeration;
import java.util.Stack;

public class Stack_Enumeration {

	public static void main(String[] args) {

        Stack s1 = new Stack();
        s1.add(21);
        s1.add('a');
        s1.add(false);
        s1.add("nazrin");
        s1.add(45.9);
        System.out.println(s1);
        
        Enumeration s2 = s1.elements();
        while(s2.hasMoreElements())
        {
        	System.out.println(s2.nextElement());
        }
        
    }

}
