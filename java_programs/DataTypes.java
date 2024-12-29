package java_programs;

public class DataTypes {
	public static void main(String[] args) {

		// Primitive Datatypes in Java.

		// Represents a small integer value from (-128 t0 127).
		byte myByte = 10;
		System.out.println(myByte);

		// Represents a short integer value from (-32,768 t0 32,767).
		short myShort = 100;
		System.out.println(myShort);

		// Represents an integer value from (-2^31 t0 2^31-1).
		// -2^31 = -2,147,483,648 , 2^31-1 = 2147483647
		int myInt = 1000;
		System.out.println(myInt);

		// Represents an long integer value from (-2^63 t0 -2^63-1).
		// -2^63 = -9223372036854775808L , 2^63-1 = 9,223,372,036,854,775,807.
		long myLong = 1000000L;
		System.out.println(myLong);

		// Represents a floating-point value from with single precision.
		float myFloat = 3.14f;
		System.out.println(myFloat);

		// Represents a floating-point value from with double precision.
		double myDouble = 3.14159;
		System.out.println(myDouble);

		// Represents a single Unicode character
		char myChar = 'A';
		System.out.println(myChar);

		// Represents a boolean value true or false
		boolean myBoolean = true;
		System.out.println(myBoolean);

		// Represents an integer value as an object
		Integer myIntegerObject = 42;
		System.out.println(myIntegerObject);

	    }
	}
            /* Output
               10
               100
               1000
               1000000
               3.14
               3.14159
               A
               true
               42 */


