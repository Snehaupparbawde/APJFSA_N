package java_programs;

import java.util.Stack;

public class StackExample1 {
	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		// adding elements to the stack
		s.push(10);
		s.push(14);
		s.push(12);
		s.push(56);
		s.push(15);
		s.push(104);
		s.push(100);
		s.push(11);
		s.push(22);
		s.push(16);
		System.out.println("Stack Before removing: " + s); // Displaying the original stack

		for (int i = 0; i < 4; i++) { // Removing the elements using for loop
			if (!s.isEmpty()) {
				System.out.println(s.pop()); // Printing the removed elements
			} else {
				System.out.println("Stack is empty...");
			}
		}
		System.out.println("Stack Before removing: " + s); // Printing stack after removing

	}

}
   /* Output
      Stack Before removing: [10, 14, 12, 56, 15, 104, 100, 11, 22, 16]
      16
      22
      11
      100
      Stack Before removing: [10, 14, 12, 56, 15, 104]*/
