import java.io.*;
import java.util.*;

public class HighestNumberSum 
{
    public static void main(String[] args) 
    {
        String inputFileName="input.txt";
        String outputFileName="output.txt";

        try{
            // Reading from input.txt
            File inputFile=new File(inputFileName);
            Scanner scanner=new Scanner(inputFile);

            scanner.useDelimiter(",\\s*"); 
            // Split numbers by comma

            List<Integer>numbers=new ArrayList<>();

            // Reading numbers from file
            while(scanner.hasNextInt()) 
            {
                numbers.add(scanner.nextInt());
            }
            scanner.close();

            if(numbers.isEmpty()) 
            {
                System.out.println("No numbers found in the file.");
                return;
            }

            // Find the highest number
            int highest=Collections.max(numbers);

            // Calculate the sum of natural numbers up to highest
            long sum=(long)highest*(highest+1)/2;

            // Writing to output.txt
            PrintWriter writer=new PrintWriter(outputFileName);
            writer.println(highest+", "+sum);
            writer.close();

            System.out.println("Results written to output.txt successfully.");
        } 
        catch(FileNotFoundException e) 
        {
            System.out.println("Error: Input file not found.");
        } 
        catch (Exception e) 
        {
            System.out.println("An error occurred: "+e.getMessage());
        }
    }
}