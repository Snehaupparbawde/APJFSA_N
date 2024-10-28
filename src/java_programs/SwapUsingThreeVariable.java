package java_programs;

public class SwapUsingThreeVariable {
	public static void main(String[] args) {
		// Initialize variables
		int a = 4; // First number
		int b = 6; // Second number
		int c = 8; // Third number

		// Display values before swapping
		System.out.println("Before Swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		// Swap values using temporary variable
		int temp; // Temporary variable for swapping

		// Swap a and b
		System.out.println("\nSwapping a and b...");
		temp = a; // Store a in temp
		a = b; // Assign b to a
		b = temp; // Assign temp (a) to b

		// Swap b and c
		System.out.println("\nSwapping b and c...");
		temp = b; // Store b in temp
		b = c; // Assign c to b
		c = temp; // Assign temp (b) to c

		// Display swapped values
		System.out.println("\nAfter Swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
                   /* Output 
                     Before Swapping:
                     a = 4
                     b = 6
                     c = 8
                     Swapping a and b...
                     Swapping b and c...
                     After Swapping:
                     a = 6
                     b = 8
                     c = 4 */

                    
 
 
 
