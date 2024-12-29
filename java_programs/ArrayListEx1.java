package java_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(123);
		al.add(132);
		al.add(120);
		al.add(125);
		al.add(122);
		al.add(15);
		al.add(13);

		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		int sum = 0;
		for (int num : al) {
			if (num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println("sum of even numbers: " + sum);
	}

}
    /* Output
       12
       123
       132
       120
       125
       122
       15
       13
       sum of even numbers: 386 */
