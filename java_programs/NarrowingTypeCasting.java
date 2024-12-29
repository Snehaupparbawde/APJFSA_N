package java_programs;

public class NarrowingTypeCasting {
	
	double doubleVar = 40;
	long longVar = 80;

	public void TypeCasting() {
		// Printing values before type casting

		System.out.println("Before Type Casting Double:" + doubleVar);
		System.out.println("Before Type Casting Long:" + longVar);

		int x = (int) doubleVar; // Type casting datatype Double converted into integer
		int y = (int) longVar; // Type casting datatype Long converted into integer

		// Printing values after type casting

		System.out.println("After Type Casting Double:" + x);
		System.out.println("After Type Casting Long:" + y);
	}

	public static void main(String[] args) {
		NarrowingTypeCasting obj = new NarrowingTypeCasting();

		obj.TypeCasting();
	}

}
          /* Output
             Before Type Casting Double:40.0
             Before Type Casting Long:80
             After Type Casting Double:40
             After Type Casting Long:80 */