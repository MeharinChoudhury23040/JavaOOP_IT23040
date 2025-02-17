import java.util.Random;

public class CustomRandomGenerator
{
    private static final int[] seedArray={3, 7, 11, 19, 23, 29, 31, 37, 41, 43}; // Custom seed values

    // Generates 'n' random numbers using timestamp, array values, and modulo
    public static void myRand(int n) 
    {
        Random random=new Random(System.nanoTime()); // Seed from timestamp
        for (int i=0;i<n;i++) 
        {
            int randValue=Math.abs(random.nextInt())%seedArray[i%seedArray.length];
            System.out.println(randValue);
        }
    }

    // Overloaded version: Generates 'n' random numbers in the range [0, bound)
    public static void myRand(int n,int bound) 
    {
        Random random=new Random(System.nanoTime());
        for (int i=0;i<n;i++) 
        {
            int randValue=Math.abs(random.nextInt())%bound;
            System.out.println(randValue);
        }
    }

    // Overloaded version: Generates 'n' random numbers in the range [min, max]
    public static void myRand(int n,int min,int max)
    {
        Random random=new Random(System.nanoTime());
        for (int i=0;i<n;i++) 
        {
            int randValue=min+Math.abs(random.nextInt())%(max-min+1);
            System.out.println(randValue);
        }
    }

    // Main method to test the random generator
    public static void main(String[] args)
    {
        System.out.println("Random numbers using default method:");
        myRand(5);

        System.out.println("\nRandom numbers in range [0, 50):");
        myRand(5, 50);

        System.out.println("\nRandom numbers in range [10, 100]:");
        myRand(5, 10, 100);
    }
}
