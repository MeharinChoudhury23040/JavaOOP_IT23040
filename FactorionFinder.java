import java.util.Scanner;

public class FactorionFinder 
{
    // Precompute factorials of digits 0-9
    static int[] factorials=new int[10];

    static void precomputeFactorials() 
    {
        factorials[0]=1; // 0! = 1
        int fact=1;
        for (int i=1;i<10;i++) 
        {
            fact*=i;
            factorials[i]=fact;
        }
    }

    // Check if a number is a factorion
    static boolean isFactorion(int num) 
    {
        int sum=0,temp=num;
        while(temp>0) 
        {
            int digit=temp%10;
            sum+=factorials[digit];
            temp/=10;
        }
        return sum==num;
    }

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        
        // Taking range input
        System.out.print("Enter the lower bound of the range: ");
        int lower=scanner.nextInt();
        
        System.out.print("Enter the upper bound of the range: ");
        int upper=scanner.nextInt();
        
        scanner.close();

        precomputeFactorials(); // Precompute factorials

        System.out.println("Factorion numbers in the range:");
        
        boolean found=false;
        for (int i=lower;i<=upper;i++) 
        {
            if(isFactorion(i)) 
            {
                System.out.print(i+" ");
                found=true;
            }
        }

        if(!found) 
        {
            System.out.println("None found in this range.");
        }
    }
}
