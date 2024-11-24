package java_programs;

public class FinallyBlock {
	public static void main(String[] args) {
		int num = 24;

		try {
			// Trying to divide a number by 0
			int result = num / 0; // This will throw ArithmeticException
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e);
		} finally {
			// This block will always execute, even if an exception occurs or not
			System.out.println("This will always execute, regardless of exception.");

		}

		System.out.println("Program continues after finally block");
	}
}
    /* Output
       Exception caught: java.lang.ArithmeticException: / by zero
       This will always execute, regardless of exception.
       Program continues after finally block */