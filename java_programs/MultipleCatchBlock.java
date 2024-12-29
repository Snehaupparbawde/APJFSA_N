package java_programs;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30 };
		int divisor = 0;

		try {
			// Attempt to divide by zero
			System.out.println("Result: " + (numbers[1] / divisor));

			// Attempt to access an invalid index
			System.out.println("Accessing element: " + numbers[5]);
		} catch (ArithmeticException e) {
			// Catch block for arithmetic exceptions
			System.out.println("Arithmetic Exception caught: Division by zero is not allowed.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Catch block for array index out-of-bounds exceptions
			System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index access.");
		} catch (Exception e) {
			// Generic catch block for any other exceptions
			System.out.println("An unexpected exception occurred: " + e.getMessage());
		}

		System.out.println("Program continues after the try-catch blocks.");
	}

}
    /* Output
       Arithmetic Exception caught: Division by zero is not allowed.
       Program continues after the try-catch blocks.*/