package string_class_package;

import java.util.Arrays;
import java.util.Spliterator;

public class Repeat_and_Split {

	public static void main(String[] args) {
		//repeat
		String name = "nazrin";
		System.out.println(name.repeat(10));  //repeat the string 10 times
		
		//split1
		String s1 = "I am a student";
		String s2[] = s1.split(" ");
		System.out.println(Arrays.toString(s2));  //split the string where space
		
		//split2
		String a1 = "I am a student";
		String a2[] = s1.split(" ", 2);           //split the string where space for two times
		System.out.println(Arrays.toString(a2));

	}

}
