package java_programs;

import java.util.Scanner;

public class StudentesGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter student's grade (0-100): ");
		int grade = sc.nextInt();

		if (grade >= 90) {
			System.out.println("First grade:" + grade);
		} else if (grade >= 80) {
			System.out.println("Second grade:" + grade);
		} else if (grade >= 70) {
			System.out.println("Third grade:" + grade);
		} else if (grade >= 60) {
			System.out.println("Forth grade:" + grade);
		} else if (grade >= 0) {
			System.out.println("Fail:" + grade);
		} else {
			System.out.println("Invalid Grade");
		}

	}

}
