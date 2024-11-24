package java_programs;

public class Min_Array {
	public static void main(String[] args) {
		int a[] = { 11, 34, 67, 89, 2, 21, 1 };
		int minArray = a[0];

		// Find the smallest element
		for (int i = 1; i < a.length; i++) {
			if (a[i] < minArray) {
				minArray = a[i];
			}
		}
		// Print the smallest element
		System.out.println("Smallest element is " + minArray);
	}
}
    /* Output
       Smallest element is 1 */