package java_programs;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String args[]) {
		// Create Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Prompt user for input
		System.out.print("Enter student's marks (0-100): ");
		int marks = sc.nextInt();

		// Validate input (assuming marks are within 0-100 range)
		// Determine grade based on marks
		if (marks > 90) {
			System.out.println("The student's grade is: A");
		} else if (marks > 80) {
			System.out.println("The student's grade is: B");
		} else if (marks > 70) {
			System.out.println("The student's grade is: C");
		} else if (marks > 60) {
			System.out.println("The student's grade is: D");
		} else {
			System.out.println("The student's grade is: Failed...");
		}
		
	}
}

             /* OutPut
                Enter student's marks (0-100): 85
                The student's grade is: B */

 