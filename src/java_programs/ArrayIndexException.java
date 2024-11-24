package java_programs;

import java.util.Scanner;

public class ArrayIndexException {

	public static void main(String[] args) {
		// Initialize an array
		int[] numbers = { 10, 20, 30, 40, 50 };
		Scanner scanner = new Scanner(System.in);

		try {
			// Ask the user for an array index
		
			System.out.print("Enter an index to access the array: ");
			
			int index = scanner.nextInt();

			// Attempt to access the array at the given index
			System.out.println("Value at index " + index + " is: " + numbers[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handle the exception
			System.out.println("Error: Invalid index! " + e.getMessage());
			
			System.out.println("Please enter an index between 0 and " + (numbers.length - 1));
		} finally {
			// Close the scanner and display a final message
			scanner.close();
			System.out.println("Program completed.");
		}
	}
}
    /* Output
       Enter an index to access the array: 8
       Error: Invalid index! Index 8 out of bounds for length 5
       Please enter an index between 0 and 4
       Program completed.*/