import java.util.Scanner;

public class CharacterCounter 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a string: ");
        String input=scanner.nextLine();
        
        int letters=0,whitespaces=0,digits=0;
        
        // Loop through each character and categorize it
        for(char ch:input.toCharArray()) 
        {
            if(Character.isLetter(ch)) 
            {
                letters++;
            } 
            else if(Character.isWhitespace(ch)) 
            {
                whitespaces++;
            } 
            else if(Character.isDigit(ch)) 
            {
                digits++;
            }
        }
        
        // Print the results
        System.out.println("Letters: "+letters);
        System.out.println("Whitespace characters: "+whitespaces);
        System.out.println("Digits: "+digits);
        
        scanner.close();
    }
}