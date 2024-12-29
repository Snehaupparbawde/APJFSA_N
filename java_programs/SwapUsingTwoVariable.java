package java_programs;

public class SwapUsingTwoVariable {
	public static void main(String[] args) {
		// Initialize variables
		int a = 4; // First number
		int b = 6; // Second number

		// Display values before swapping
		System.out.println("Before Swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// Swap values without temporary variable
		// Step 1: Add a and b
		a = a + b; // a = 10 (4 + 6)

		// Step 2: Subtract b from new a to get original a
		b = a - b; // b = 4 (10 - 6)

		// Step 3: Subtract new b from new a to get original b
		a = a - b; // a = 6 (10 - 4)

		// Display swapped values
		System.out.println("After Swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
                /* Output
                   Before Swapping:
                   a = 4
                   b = 6
                   After Swapping:
                   a = 6
                   b = 4*/
