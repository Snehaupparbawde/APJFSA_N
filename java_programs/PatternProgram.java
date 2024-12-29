package java_programs;

public class PatternProgram {

	// Main method
	public static void main(String[] args) {

		// Number of rows in the pattern
		int rows = 5;

		// Loop through each row
		for (int i = 1; i <= rows; i++) {

			// Loop through each column in the current row
			for (int j = 1; j <= i; j++) {

				// Print numbers in sequence
				System.out.print(j);
			}

			// Move to next line after each row
			System.out.println();
		}
	}
}
