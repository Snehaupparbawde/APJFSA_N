package java_programs;

class Student {
	String name;
	int age;

	// Constructor that takes name and age as parameters
	Student(String name, int age) {
		this.name = name; // Assigning the parameter name to the instance variable name
		this.age = age; // Assigning the parameter age to the instance variable age
	}

	// Constructor that takes another Student object as a parameter
	Student(Student student) {
		// Using 'this' keyword to call the primary constructor with student name and
		// age
		this(student.name, student.age);
	}

	// Method to display student information
	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		// Creating a Student object using the first constructor
		Student student1 = new Student("Sneha", 20);

		// Creating another Student object using the second constructor, passing
		// 'student1' object
		Student student2 = new Student(student1);

		// Displaying both student objects
		student1.display();
		student2.display();
	}
}
/*
 * OUTPUT Name: Sneha, Age: 20 Name: Sneha, Age: 20
 */
