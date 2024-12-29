package java_programs;

/*
Create a Student class and create an array list to add 10 student objects and
print them using a for each loop.
*/

import java.util.ArrayList;

class Student {
	int i;
	String name;

	Student(int i, String name) { // Parameterized constructor
		this.i = i;
		this.name = name;
	}

	// Getter and setter
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Student ID: " + i + "\n" + "Student Name: " + name;
	}
}

public class StudentArrayList {
	public static void main(String[] args) {
		// Create an ArrayList to hold Student objects
		ArrayList<Student> s = new ArrayList<>();

		// Add 10 Student objects to the list
		s.add(new Student(1, "Sneha"));
		s.add(new Student(2, "Priyal"));
		s.add(new Student(3, "Shiva"));
		s.add(new Student(4, "Riya"));
		s.add(new Student(5, "Neha"));
		s.add(new Student(6, "Priyanka"));
		s.add(new Student(7, "Siddhi"));
		s.add(new Student(8, "Apeksha"));
		s.add(new Student(9, "Sakshi"));
		s.add(new Student(10, "Priya"));

		// Printing the Student objects using a for-each loop
		for (Student stud : s) {
			System.out.println(stud);
			System.out.println();
		}

	}
}
/*
 * OUTPUT Student ID: 1 Student Name: Sneha
 * 
 * Student ID: 2 Student Name: Priyal
 * 
 * Student ID: 3 Student Name: Shiva
 * 
 * Student ID: 4 Student Name: Riya
 * 
 * Student ID: 5 Student Name: Neha
 * 
 * Student ID: 6 Student Name: Priyanka
 * 
 * Student ID: 7 Student Name: Siddhi
 * 
 * Student ID: 8 Student Name: Apeksha
 * 
 * Student ID: 9 Student Name: Sakshi
 * 
 * Student ID: 10 Student Name: Priya
 * 
 */