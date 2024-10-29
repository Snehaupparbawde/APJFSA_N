package java_programs;

import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String[] args) {
		System.out.println("Welcome to Check the Palindrome Number");

		// Create a Scanner object to read user input
		Scanner sc = new Scanner(System.in);

		// Prompt user for a number
		System.out.print("Enter a number to check if it's a palindrome: ");
		int num = sc.nextInt();

		// Check if the number is a Palindrome
		if (isPalindrome(num)) {
			System.out.println(num + " is a palindrome number.");
		} else {
			System.out.println(num + " is not a palindrome number.");
		}

	}

// Method to check if a number is a Palindrome
	public static boolean isPalindrome(int num) {
		// Initialize variables
		int reversedNum = 0;
		int originalNum = num;

		// Reverse the number
		while (num != 0) {
			int digit = num % 10; // Extract last digit
			reversedNum = reversedNum * 10 + digit; // Append digit to reversed number
			num /= 10; // Remove last digit from original number
		}

		// Check if reversed number matches original number
		return originalNum == reversedNum;
	}
}
                 /* Output
                   Welcome to Check the Palindrome Number  
                  Enter a number to check if it's a Palindrome: 1331
                  1331 is a Palindrome number.*/
