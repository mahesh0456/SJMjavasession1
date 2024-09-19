package java_code_session;

public class Rectangle
{
	    private double length;
	    private double width;
	    public Rectangle(double length, double width)  //constructor
	    {
	        this.length = length;
	        this.width = width;
	    }
	    public double area()  //calculate the area
	    {
	        return length * width;
	    } 
	    public double perimeter() 
	    {
	        return 2 * (length + width);  //calculate the perimeter
	    } 
	    public void displayDimensions()   //display the dimensions
	    {
	        System.out.println("Length: " + length);
	        System.out.println("Width: " + width);
	    }

	    public static void main(String[] args)
	    {
	        Rectangle rectangle = new Rectangle(9.0, 7.0);
	        rectangle.displayDimensions();
	        System.out.println("Area: " + rectangle.area());  //Calculate and display area

	        System.out.println("Perimeter: " + rectangle.perimeter());   // Calculate and display perimeter
	    }
	}


