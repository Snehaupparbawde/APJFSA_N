package java_programs;

import java.util.Scanner;

public class EvenOddCheckNumber {
	public static void main(String[] args) {
		// Create a Scanner object to read from the console
		Scanner sc = new Scanner(System.in);

		// Display the Welcome message
		System.out.println("Welcome to Even Odd Check the Number");

		// Display program title and separator
		System.out.println("Even/Odd Checker");
		System.out.println("-------------------------------------");

		// Prompt user to enter a number
		System.out.println("Enter a number: ");

		// Store user input in the 'number' variable
		int number = sc.nextInt();

		// Use conditional operator to check if number is odd (number % 2 != 0)
		// If true, assign "Odd" to 'result'; otherwise, assign "Even"
		String result = (number % 2 != 0) ? "Odd" : "Even";

		// Display result section header
		System.out.println("\nResult:");

		// Print number and its parity (even/odd)
		System.out.println(number + " is " + result);

	}
}
                  /* Welcome to Even Odd Check the Number Even/Odd Checker
                     ------------------------------------ 
                     Enter a number: 1 
                     Result: 1 is Odd */
