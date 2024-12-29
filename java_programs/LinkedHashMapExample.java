package java_programs;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String args[]) {
		LinkedHashMap<String, String> l = new LinkedHashMap<>();
		l.put("1", "Apple");
		l.put("2", "Kiwi");
		l.put("3", "Banana");
		l.put("4", "Mango");
		l.put("5", "Orange");
		l.put("9", null);
		l.put(null, "Grapse");
		l.put(null, "Guava");
		l.put("7", null);

		System.out.println(l);

		System.out.println(l.size());
	}

}
   /* Output
      {1=Apple, 2=Kiwi, 3=Banana, 4=Mango, 5=Orange, 9=null, null=Guava, 7=null}
      8 */
