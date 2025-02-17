class InvalidRadiusException extends Exception 
{
    public InvalidRadiusException(String message) 
    {
        super(message);
    }
}

class Circle 
{
    private double radius;

    public void setRadius(double radius) throws InvalidRadiusException 
    {
        if(radius<0) 
        {
            throw new InvalidRadiusException("Radius cannot be negative: "+radius);
        }
        this.radius=radius;
    }

    public double calculateArea() 
    {
        return Math.PI*radius*radius;
    }
}

public class CircleAreaCalculator
{
    public static void main(String[] args)
    {
        Circle circle=new Circle();

        try 
        {
            circle.setRadius(-5); // This will trigger an exception
            System.out.println("Area: "+circle.calculateArea());
        } 
        catch(InvalidRadiusException e) 
        {
            System.out.println("Exception: "+e.getMessage());
        }

        // Correct Usage
        try 
        {
            circle.setRadius(7);
            System.out.println("Area: "+circle.calculateArea()); // Expected output
        } 
        catch (InvalidRadiusException e) 
        {
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
