package java_programs;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {

		// Welcome message
		System.out.println("*** Welcome to Reverse Number Program ***");

		// Create Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Prompt user for input
		System.out.print("Enter a positive integer: ");
		int number = sc.nextInt();

		// Validate input
		while (number <= 0) {
			System.out.println("Invalid input. Please enter a positive integer.");
			System.out.print("Enter a positive integer: ");
			number = sc.nextInt();
		}

		// Store original number
		int originalNumber = number;

		// Reverse number
		int reversedNumber = reverseNumber(number);

		// Display results
		System.out.println("Original Number: " + originalNumber);
		System.out.println("Reversed Number: " + reversedNumber);
	}

	// Method to reverse a number
	public static int reverseNumber(int number) {
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}
		return reversed;
     
	}
	

}
               /*
              *** Welcome to Reverse Number Program ***
               Enter a positive integer: 12345
               Original Number: 12345
               Reversed Number: 54321
               */