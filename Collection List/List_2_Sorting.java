package collection_list_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_2_Sorting {

	public static void main(String[] args) {
		List b1 = new ArrayList();
		b1.add(23456);
		b1.add(32);
		b1.add(43);
		b1.add(1900);
		b1.add(200);
		System.out.println("Before sort -> "+b1);
		Collections.sort(b1);
		System.out.println("After sort -> "+b1);

	}

}
