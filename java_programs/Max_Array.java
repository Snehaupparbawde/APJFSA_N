package java_programs;

public class Max_Array {

	public static void main(String[] args) {
		int a[] = { 11, 34, 67, 89, 2, 201, 1 };
		int maxArray = a[0];

		// Find the Largest element
		for (int i = 1; i < a.length; i++) {
			if (a[i] > maxArray) {
				maxArray = a[i];
			}
		}
		// Print the Largest element
		System.out.println("Largest element is " + maxArray);
	}
}

    /* OUTPUT
       Largest element is 201 */
