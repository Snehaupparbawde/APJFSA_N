package java_programs;

import java.util.ArrayList;
import java.util.Collections;

public class ReversingArrayList {
	public static void main(String args[]) {
		ArrayList<Integer> ar = new ArrayList<>();
		// Adding elements in arrayList
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		ar.add(87);
		ar.add(2);
		ar.add(4);

		System.out.println("Original List: " + ar);

		Collections.reverse(ar); // Reversing the elements of original array
		System.out.println("Reversed List: " + ar);

		Collections.sort(ar);
		System.out.println("Sorted list: " + ar); // Sorting the elements in increasing order
	}

}
   /* Output
      Original List: [3, 4, 5, 6, 87, 2, 4]
      Reversed List: [4, 2, 87, 6, 5, 4, 3]
      Sorted list: [2, 3, 4, 4, 5, 6, 87]*/