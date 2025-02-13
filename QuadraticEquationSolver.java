import java.util.Scanner;

public class QuadraticEquationSolver
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

        // Taking input for coefficients a, b, and c
        System.out.print("Enter coefficients a, b, and c: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        // Compute the discriminant
        double discriminant=b*b-4*a*c;

        if (discriminant<0) 
        {
            System.out.println("No real roots.");
        } 
        else 
        {
            // Compute the two roots using the quadratic formula
            double root1=(-b+Math.sqrt(discriminant))/(2.0*a);
            double root2=(-b-Math.sqrt(discriminant))/(2.0*a);

            // Find the smallest positive root
            double smallestPositiveRoot=-1;

            if(root1>0 && root2>0) 
            {
                smallestPositiveRoot=Math.min(root1,root2);
            }
            else if(root1>0) 
            {
                smallestPositiveRoot=root1;
            } 
            else if(root2>0) 
            {
                smallestPositiveRoot=root2;
            }

            // Print the result
            if(smallestPositiveRoot>0) 
            {
                System.out.printf("The smallest positive root is: %.1f%n",smallestPositiveRoot);
            } 
            else 
            {
                System.out.println("No positive roots.");
            }
        }

        scanner.close();
    }
}
