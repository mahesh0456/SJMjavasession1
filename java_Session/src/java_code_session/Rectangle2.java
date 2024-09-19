package java_code_session;

public class Rectangle2 
{
	    private double length;
	    private double width;

	    public Rectangle2() // Default constructor (length and width of 1)
	    {
	        this.length = 1.0;
	        this.width = 1.0;
	    }
	    public Rectangle2(double side) // Constructor for a square (one parameter)
	    {
	        this.length = side;
	        this.width = side;
	    }

	    public Rectangle2(double length, double width)   // Constructor for rectangle (two parameters)
	    {
	        this.length = length;
	        this.width = width;
	    }
	    public double area()  // Method to calculate the area
	    {
	        return length * width;
	    }
	    public double perimeter()   // Method to calculate the perimeter
	    {
	        return 2 * (length + width);
	    }
	    public void displayDimensions() // Method to display the dimensions
	    {
	        System.out.println("Length: " + length);
	        System.out.println("Width: " + width);
	    }

	    public static void main(String[] args) {
	        // Create a rectangle using the default constructor
	        Rectangle2 defaultRectangle = new Rectangle2();
	        System.out.println("Default Rectangle:");
	        defaultRectangle.displayDimensions();
	        System.out.println("Area: " + defaultRectangle.area());
	        System.out.println("Perimeter: " + defaultRectangle.perimeter());
	        System.out.println();

	        // Create a rectangle using the square constructor
	        Rectangle2 square = new Rectangle2(2.0);
	        System.out.println("Square Rectangle:");
	        square.displayDimensions();
	        System.out.println("Area: " + square.area());
	        System.out.println("Perimeter: " + square.perimeter());
	        System.out.println();

	        // Create a rectangle using the two-parameter constructor
	        Rectangle2 rectangle = new Rectangle2(7.0, 5.0);
	        System.out.println("Custom Rectangle:");
	        rectangle.displayDimensions();
	        System.out.println("Area: " + rectangle.area());
	        System.out.println("Perimeter: " + rectangle.perimeter());
	    }
	}


