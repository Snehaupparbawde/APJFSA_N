package java_programs;

public class Perimeter {

	// Method to calculate Perimeter of square
	public double calculateSquarePerimeter(int side) {
		return 4 * side;
	}

	// Method to calculate Perimeter of rectangle
	public double calculateRectanglePerimeter(int length, int breadth) {
		return 2 * (length + breadth);
	}

	// Method to calculate Perimeter (circumference) of circle
	public double calculateCirclePerimeter(double radius) {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {
		Perimeter perimeter = new Perimeter();

		// Calculate Perimeter of square
		int squareSide = 5;
		double squarePerimeter = perimeter.calculateSquarePerimeter(squareSide);
		System.out.println("Perimeter of square with side " + squareSide + " = " + squarePerimeter);

		// Calculate Perimeter of rectangle
		int rectangleLength = 6;
		int rectangleBreadth = 4;
		double rectanglePerimeter = perimeter.calculateRectanglePerimeter(rectangleLength, rectangleBreadth);
		System.out.println("Perimeter of rectangle with length " + rectangleLength + " and breadth " + rectangleBreadth
				+ " = " + rectanglePerimeter);

		// Calculate Perimeter (circumference) of circle
		double circleRadius = 3.5;
		double circlePerimeter = perimeter.calculateCirclePerimeter(circleRadius);
		System.out.println("Perimeter (circumference) of circle with radius " + circleRadius + " = " + circlePerimeter);
	}
} 
         /* Output 
            Perimeter of square with side 5 = 20.0
            Perimeter of rectangle with length 6 and breadth 4 = 20.0
            Perimeter (circumference) of circle with radius 3.5 = 21.991148575128552 */
