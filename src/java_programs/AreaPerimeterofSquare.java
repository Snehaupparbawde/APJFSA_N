package java_programs;

public class AreaPerimeterofSquare {
	public void AreaOfSquare(float side) {

		float ans = side * side; // calculating using formula

		System.out.println("Area of Square:" + ans);

	}

	// Calculating Perimeter of Square
	public void Perimeter(float side) {

		float val = 4 * side; // calculating using formula

		System.out.println("Perimeter of Square:" + val);

	}

	public static void main(String[] args) {
		AreaPerimeterofSquare obj = new AreaPerimeterofSquare(); // instance of class

		obj.AreaOfSquare(4); // Passing value of side as a parameter

		obj.Perimeter(6); // Passing value of side as a parameter
	}
}
                    /*Output
                      Area of Square:16.0
                      Perimeter of Square:24.0 */