import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MeharinForKids 
{
    public static void main(String[] args) 
    {
        String inputFile="input.txt";
        String outputFile="output.txt"; 
        int score=0; 
        int wrongAnswers=0; 
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to the Quiz!");

        System.out.print("Enter your name: ");
        String playerName=scanner.nextLine().trim();

        System.out.print("Do you want to play?(yes/no): ");
        String playChoice=scanner.nextLine().trim().toLowerCase();

        if(!playChoice.equals("yes")) 
	{
            System.out.println("Maybe next time!Goodbye!");
            return;
        }

        System.out.println("Select a difficulty level:");
        System.out.println("1.Beginner (5 questions)");
        System.out.println("2.Intermediate (10 questions)");
        System.out.println("3.Hard (20 questions)");
        System.out.print("Enter your choice (1/2/3): ");
        int difficulty=scanner.nextInt();
        int questionLimit;
        String difficultyLevel;

        switch(difficulty) 
	{
            case 1:
                questionLimit=5;
                difficultyLevel="Beginner";
                System.out.println("You chose Beginner.");
                break;

            case 2:
                questionLimit=10;
                difficultyLevel="Intermediate";
                System.out.println("You chose Intermediate.");
                break;

            case 3:
                questionLimit=20;
                difficultyLevel="Hard";
                System.out.println("You chose Hard.");
                break;

            default:
                questionLimit=5;
                difficultyLevel="Beginner";
                System.out.println("Invalid choice.Defaulting to Beginner.");
        }

        try(BufferedReader br=new BufferedReader(new FileReader(inputFile))) 
        {
            String line;
            int questionCount=0;

            while ((line=br.readLine())!=null && questionCount<questionLimit) 
	    {
                String[] parts=line.split("=");
                if(parts.length!=2) 
		{
                    System.out.println("Invalid format: "+line);
                    continue;
                }

                String expression=parts[0].trim();
                int correctAnswer=Integer.parseInt(parts[1].trim());
                int calculatedAnswer=evaluateExpression(expression);

                System.out.println("What is the result of: "+expression+"?");
                int userAnswer=scanner.nextInt();

                if(userAnswer==correctAnswer && userAnswer==calculatedAnswer) 
		{
                    System.out.println("Correct!");
                    score++;
                } 
		else 
		{
                    System.out.println("Wrong!The correct answer is: "+calculatedAnswer);
                    wrongAnswers++;
                }
                questionCount++;
            }

            System.out.println("\nQuiz Over!");
            System.out.println("Your final score is: "+score+"/"+questionLimit);
            System.out.println("Correct answers: "+score);
            System.out.println("Wrong answers: "+wrongAnswers);

            String currentDate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

            try(BufferedWriter bw=new BufferedWriter(new FileWriter(outputFile,true))) 
	    {
                File file=new File(outputFile);
                if(file.length()==0) 
		{
                    bw.write(String.format("%-20s %-10s %-20s %-15s%n","Player Name","Score","Date and Time","Difficulty Level"));
                }
                bw.write(String.format("%-20s %-10s %-20s %-15s%n",playerName,score+"/" +questionLimit,currentDate,difficultyLevel));
            }
        } 
        catch(IOException e) 
	{
            System.out.println("Error reading the file: "+e.getMessage());
        } 
	catch(NumberFormatException e) 
	{
            System.out.println("Invalid number format in the file.");
        }
    }

    private static int evaluateExpression(String expression)
    {
        if(expression.contains("+")) 
	{
            String[] numbers=expression.split("\\+");
            return Integer.parseInt(numbers[0].trim())+Integer.parseInt(numbers[1].trim());
        } 
	else if(expression.contains("-")) 
	{
            String[] numbers = expression.split("-");
            return Integer.parseInt(numbers[0].trim())-Integer.parseInt(numbers[1].trim());
        } 
	else if(expression.contains("*")) 
	{
            String[] numbers=expression.split("\\*");
            return Integer.parseInt(numbers[0].trim())*Integer.parseInt(numbers[1].trim());
        } 
	else if(expression.contains("/")) 
	{
            String[] numbers=expression.split("/");
            return Integer.parseInt(numbers[0].trim())/Integer.parseInt(numbers[1].trim());
        } 
	else
	{
            throw new IllegalArgumentException("Unsupported operation in expression: "+expression);
        }
    }
}