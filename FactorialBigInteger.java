import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigInteger
    {
    // Method to compute factorial using BigInteger
    public static BigInteger factorial(int n) 
        {
        BigInteger result=BigInteger.ONE;
        for (int i=1;i<=n;i++) 
        {
            result=result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        scanner.close();

        System.out.println(num+"! is \n"+factorial(num));
    }
}
