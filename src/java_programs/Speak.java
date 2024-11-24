package java_programs;

//Define the interface
interface Person {
	void speak(); // Abstract method to be implemented by classes
}

//Student class implementing Person interface
class Student1 implements Person {

	public void speak() {
		System.out.println("I am a student. I am here to learn.");
	}
}

//Teacher class implementing Person interface
class Teacher implements Person {

	public void speak() {
		System.out.println("I am a teacher. I am here to teach.");
	}
}

public class Speak {
	public static void main(String[] args) {
		// Create objects of Student and Teacher
		Person student = new Student1();
		Person teacher = new Teacher();

		// Call the speak method for both objects
		student.speak();
		teacher.speak();
	}
}
    /* Output
       I am a student. I am here to learn.
       I am a teacher. I am here to teach. */