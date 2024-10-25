package java_programs;

import java.util.Scanner;

/**
 * Program to find the largest among three numbers.
 */
public class Largest_Number {
	public static void main(String[] args) {
		// Create Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Declare variables for three numbers
		int x, y, z;

		// Prompt user for input
		System.out.print("Enter the first number: ");
		x = sc.nextInt();

		System.out.print("Enter the second number: ");
		y = sc.nextInt();

		System.out.print("Enter the third number: ");
		z = sc.nextInt();

		// Find and display the largest number
		if (x > y && x > z) {
			// x is the largest
			System.out.println("Largest number: " + x);
		} else if (y > x && y > z) {
			// y is the largest
			System.out.println("Largest number: " + y);
		} else if (z > x && z > y) {
			// z is the largest
			System.out.println("Largest number: " + z);
		} else {
			// Numbers are not distinct
			System.out.println("All the numbers are not distinct.");
		}
		
	}
} 
          /* Output 
            Enter the first number: 10
            Enter the second number: 20
            Enter the third number: 30
            Largest number: 30 */
