package java_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String args[]) {
		// Creating object of HashMap
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(100, "Anudip");
		hm.put(101, "Ball");
		hm.put(103, "Dog");
		hm.put(104, "Egg");
		hm.put(102, "Cow");
		hm.put(107, "Ant");
		hm.put(102, "Mango");
		hm.put(99, "Camel"); // not allowed key = null

		// System.out.println(hm);
		// System.out.println(hm.entrySet());

		Set s = hm.entrySet();
		Iterator i = s.iterator(); // Printing the elements of HashMap using Iterator
		while (i.hasNext()) {
			// System.out.println(i.next());

			Map.Entry me = (Map.Entry) i.next();
			System.out.println("Key:" + me.getKey() + "\t" + "value: " + me.getValue());
			// System.out.println(); // to break the line after every iteration
		}
	}

}
    /* Output
       Key:99	value: Camel
       Key:100	value: Anudip
       Key:101	value: Ball
       Key:102	value: Mango
       Key:103	value: Dog
       Key:104	value: Egg
       Key:107	value: Ant */
