package java_programs;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetRemoveAll {
	public static void main(String args[]) {
		// Creating object of HashSet
		HashSet<String> h = new HashSet<>();
		// Adding elements to the HashSet
		h.add("a");
		h.add("e");
		h.add("i");
		h.add("o");
		h.add("u");
		// System.out.println(h);

		System.out.println("Before deleting all the elements from the HashSet: ");
		// Printing the elements using Iterator interface
		Iterator i = h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// h.removeAll(h);
		System.out.println("All Elements are deleted and the HashSet is Empty now: " + h.removeAll(h));
		System.out.println(h);
	}

}
   /* Output
      Before deleting all the elements from the HashSet: 
      a
      e
      u
      i
      o
      All Elements are deleted and the HashSet is Empty now: true
     []*/

