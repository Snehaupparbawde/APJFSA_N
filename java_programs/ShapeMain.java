package java_programs;

//Define the Shape interface with the getArea() method
interface Shape {
	double getArea(); // method to calculate the area
}

//Rectangle class implements Shape interface
class Rectangle implements Shape {
	double length;
	double width;

	// Constructor to initialize length and width
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// Implement the getArea() method for Rectangle
	public double getArea() {
		return length * width;
	}
}

//Circle class implements Shape interface
class Circle implements Shape {
	double radius;

	// Constructor to initialize radius
	public Circle(double radius) {
		this.radius = radius;
	}

	// Implement the getArea() method for Circle
	public double getArea() {
		return Math.PI * radius * radius; // Area = π * r^2
	}
}

//Triangle class implements Shape interface
class Triangle implements Shape {
	double base;
	double height;

	// Constructor to initialize base and height
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	// Implement the getArea() method for Triangle
	public double getArea() {
		return 0.5 * base * height; // Area = 1/2 * base * height
	}
}

//Main class to test the Shape interface and its implementations
public class ShapeMain {
	public static void main(String[] args) {

		// Create objects of Rectangle, Circle, and Triangle
		Shape rectangle = new Rectangle(5.0, 4.0);
		Shape circle = new Circle(3.0);
		Shape triangle = new Triangle(6.0, 4.0);

		// Display the areas of the shapes
		System.out.println("Area of Rectangle: " + rectangle.getArea());
		System.out.println("Area of Circle: " + circle.getArea());
		System.out.println("Area of Triangle: " + triangle.getArea());
	}
}
    /* Output
       Area of Rectangle: 20.0
       Area of Circle: 28.274333882308138
       Area of Triangle: 12.0 */
