import java.util.Scanner;

public class Quiz
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int score=0;
        String[][] questions= 
	{
            {"What is the capital of France?","1.Berlin","2.Paris","3.Madrid","2"},
            {"Who wrote 'Hamlet'?","1.Charles Dickens","2.Mark Twain","3.William Shakespeare","3"},
            {"What is the chemical symbol for water?","1.O2","2.H2O","3.CO2","2"},
            {"Which planet is known as the Red Planet?","1.Earth","2.Mars","3.Jupiter","2"},
            {"What is the largest mammal in the world?","1.Elephant","2.Blue Whale", "3.Giraffe","2"}
        };

        System.out.println("Welcome to the Quiz!");

        for (int i=0;i<questions.length;i++) 
	{
            System.out.println("\n" + questions[i][0]);
            System.out.println(questions[i][1]);
            System.out.println(questions[i][2]);
            System.out.println(questions[i][3]);
            System.out.print("Your answer: ");
            int answer=sc.nextInt();

            if(String.valueOf(answer).equals(questions[i][4])) 
	    {
                System.out.println("Correct!");
                score++;
            } 
	    else 
	    {
                System.out.println("Wrong!The correct answer is option "+questions[i][4]+".");
            }
        }

        System.out.println("\nQuiz Over!Your final score is:"+score+"/"+questions.length);
        sc.close();
    }
}
