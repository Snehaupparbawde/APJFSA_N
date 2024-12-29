package java_programs;

import java.util.HashSet;
import java.util.Set;

public class UnioSet1 {
	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<>();
		// Adding elements in set1
		s1.add(11);
		s1.add(12);
		s1.add(13);
		s1.add(14);
		s1.add(15);

		System.out.println("Set 1:" + s1);// Printing set1

		Set<Integer> s2 = new HashSet<>();
		// adding elements in set2
		s2.add(22);
		s2.add(33);
		s2.add(33);
		s2.add(44);
		s2.add(55);
		System.out.println("Set 2: " + s2);// printing set2

		s1.addAll(s2); // adding set1 to set2
		System.out.println("After adding set1 to set2: " + s1);// Printing the union
	}

}
/* Output
   Set 1:[11, 12, 13, 14, 15]
   Set 2: [33, 22, 55, 44]
   After adding set1 to set2: [33, 22, 55, 11, 12, 44, 13, 14, 15] */
