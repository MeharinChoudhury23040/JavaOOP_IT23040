import java.util.Date;

// Base class
class GeometricObject 
{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    // Default constructor
    public GeometricObject() 
    {
        this.color="white";
        this.filled=false;
        this.dateCreated=new java.util.Date();
    }

    // Parameterized constructor
    public GeometricObject(String color,boolean filled) {
        this.color=color;
        this.filled=filled;
        this.dateCreated=new java.util.Date();
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color=color;
    }

    public boolean isFilled() 
    {
        return filled;
    }

    public void setFilled(boolean filled) 
    {
        this.filled=filled;
    }

    public java.util.Date getDateCreated() 
    {
        return dateCreated;
    }

    public String toString() 
    {
        return "Color: "+color+", Filled: "+filled+", Date Created: "+dateCreated;
    }
}

// Circle class inheriting from GeometricObject
class Circle extends GeometricObject 
{
    private double radius;

    // Default constructor
    public Circle() 
    {
        this.radius=1.0;
    }

    // Constructor with radius
    public Circle(double radius) 
    {
        this.radius=radius;
    }

    // Constructor with radius,color,and filled
    public Circle(double radius,String color,boolean filled)
    {
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius) 
    {
        this.radius=radius;
    }

    public double getArea() 
    {
        return Math.PI*radius*radius;
    }

    public double getPerimeter() 
    {
        return 2*Math.PI*radius;
    }

    public double getDiameter()
    {
        return 2*radius;
    }

    public void printCircle() 
    {
        System.out.println("Circle: Radius = "+radius);
    }
}

// Rectangle class inheriting from GeometricObject
class Rectangle extends GeometricObject 
{
    private double width;
    private double height;

    // Default constructor
    public Rectangle() 
    {
        this.width=1.0;
        this.height=1.0;
    }

    // Constructor with width and height
    public Rectangle(double width,double height) 
    {
        this.width=width;
        this.height=height;
    }

    // Constructor with width, height, color, and filled
    public Rectangle(double width,double height,String color,boolean filled) 
    {
        super(color,filled);
        this.width=width;
        this.height=height;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width=width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height=height;
    }

    public double getArea() 
    {
        return width*height;
    }

    public double getPerimeter() 
    {
        return 2*(width+height);
    }
}

// Main class to test functionalities
public class Geometry
{
    public static void main(String[] args) 
    {
        // Create a Circle object
        Circle circle = new Circle(5,"Red",true);
        System.out.println("Circle Details:");
        System.out.println(circle);
        System.out.println("Area: "+circle.getArea());
        System.out.println("Perimeter: "+circle.getPerimeter());
        System.out.println("Diameter: "+circle.getDiameter());
        circle.printCircle();
        System.out.println();

        // Create a Rectangle object
        Rectangle rectangle=new Rectangle(4,7,"Blue",false);
        System.out.println("Rectangle Details:");
        System.out.println(rectangle);
        System.out.println("Area: "+rectangle.getArea());
        System.out.println("Perimeter: "+rectangle.getPerimeter());
    }
}