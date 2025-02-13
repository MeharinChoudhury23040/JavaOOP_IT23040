import java.util.Scanner;

public class PalindromeChecker 
{
    // Method to check if a string is a palindrome
    static boolean isPalindrome(String str) 
    {
        int left=0,right=str.length()-1;
        while(left<right) 
        {
            if(str.charAt(left)!=str.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to check if a number is a palindrome
    static boolean isPalindrome(int num) 
    {
        int original=num,reversed=0;
        while(num>0) 
        {
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        return original==reversed;
    }

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

        // Checking a string
        System.out.print("Enter a string: ");
        String str=scanner.nextLine();
        if(isPalindrome(str)) 
        {
            System.out.println("The string is a palindrome.");
        } 
        else 
        {
            System.out.println("The string is not a palindrome.");
        }

        // Checking a number
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        if(isPalindrome(num))
        {
            System.out.println("The number is a palindrome.");
        } 
        else 
        {
            System.out.println("The number is not a palindrome.");
        }

        scanner.close();
    }
}