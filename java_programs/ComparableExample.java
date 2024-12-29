package java_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int age;

	// Parameterized constructor
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Overriding compareTo method to sort by age
	public int compareTo(Employee o) {
		return Integer.compare(this.age, o.age);
	}

	// Overriding toString method for easy display
	public String toString() {
		return "Employee id = " + id + "\n" + "name = " + name + "\n" + "age = " + age;
	}
}

public class ComparableExample {
	public static void main(String[] args) {
		List<Employee> e = new ArrayList<>();
		// Creating a list of employees
		e.add(new Employee(1, "Sneha", 21));
		e.add(new Employee(2, "Priyal", 20));
		e.add(new Employee(3, "Apeksha", 22));
		e.add(new Employee(4, "Sakshi", 19));

		System.out.println("Before sorting:");
		for (Employee employee : e) {
			System.out.println(employee);
			System.out.println();
		}

		// Sorting employees by age
		Collections.sort(e);
		System.out.println("\n\nAfter Sorting based on age: ");
		for (Employee employee : e) {
			System.out.println(employee);
			System.out.println();
		}

	}
}
    /* Output
       Before sorting:
       Employee id = 1
       name = Sneha
       age = 21

       Employee id = 2
       name = Priyal
       age = 20

       Employee id = 3
       name = Apeksha
       age = 22

       Employee id = 4
       name = Sakshi
       age = 19



       After Sorting based on age: 
       Employee id = 4
       name = Sakshi
       age = 19

       Employee id = 2
       name = Priyal
       age = 20

       Employee id = 1
       name = Sneha
       age = 21

       Employee id = 3
       name = Apeksha
       age = 22 */


