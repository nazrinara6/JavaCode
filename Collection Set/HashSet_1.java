package collection_set_package;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_1 {
		public static void main(String[] args) {
			Set s1 = new HashSet();
			s1.add("manish");
			s1.add(21);
			s1.add(45.67);
			s1.add("Hello World");
			s1.add("manish");
			s1.add(null);
			s1.add(false);
			s1.add(null);
			s1.add(30);
			System.out.println(s1);
			
			//iterator
			Iterator s2 = s1.iterator();
			while(s2.hasNext())
			{
				System.out.println(s2.next());
			}
				
		}

}
