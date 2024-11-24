package java_programs;

public class MultipleCatchFinally {

	public static void main(String[] args) {
		// Example inputs
		int[] numbers = { 10, 20, 30 };
		int divisor = 0; // This will cause ArithmeticException

		try {
			// Code that may throw an exception
			System.out.println("Trying to divide the first element by the divisor...");
			
			int result = numbers[0] / divisor; // May throw ArithmeticException

			System.out.println("Accessing an element outside the array bounds...");
			
			System.out.println(numbers[5]); // May throw ArrayIndexOutOfBoundsException
		} catch (ArithmeticException e) {
			// Handles division by zero
			
			System.out.println("Caught an ArithmeticException: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handles invalid array index access
			
			System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
		} finally {
			// This block will always execute
			System.out.println("Finally block executed: Cleaning up resources.");
		}
	}
}
    /* Output
       Trying to divide the first element by the divisor...
       Caught an ArithmeticException: / by zero
       Finally block executed: Cleaning up resources.*/
