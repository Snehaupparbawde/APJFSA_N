package java_programs;

import java.util.HashSet;

public class HashSetExample1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		// Inserting elements in the hashset
		hs.add("Mango");
		hs.add("Kiwi");
		hs.add("Guava");
		hs.add("Cherry");

		System.out.println(hs); // Printing the original hashset
		hs.add("Apple");

		System.out.println("After appending apple to hashset: " + hs);

	}

}
   /* Output
     [Guava, Kiwi, Cherry, Mango]
     After appending apple to hashset: [Guava, Apple, Kiwi, Cherry, Mango]*/

