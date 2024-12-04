import java.util.Scanner;

public class CGPACalculator 
{
    public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        int totalCredits = 0;
        double totalWeightedScore = 0.0;

        if (numCourses >= 1) {
            System.out.print("Enter credit for Course 1: ");
            int credit1 = scanner.nextInt();
            totalCredits += credit1;

            System.out.print("Enter CT (out of 30) for Course 1: ");
            int ct1 = scanner.nextInt();

            System.out.print("Enter AT (out of 10) for Course 1: ");
            int at1 = scanner.nextInt();

            System.out.print("Enter FE (out of 60) for Course 1: ");
            int fe1 = scanner.nextInt();

            double grade1 = (ct1 + at1 + fe1) / 10.0;
            totalWeightedScore += grade1 * credit1;
        }

        if (numCourses >= 2) {
            System.out.print("Enter credit for Course 2: ");
            int credit2 = scanner.nextInt();
            totalCredits += credit2;

            System.out.print("Enter CT (out of 30) for Course 2: ");
            int ct2 = scanner.nextInt();

            System.out.print("Enter AT (out of 10) for Course 2: ");
            int at2 = scanner.nextInt();

            System.out.print("Enter FE (out of 60) for Course 2: ");
            int fe2 = scanner.nextInt();

            double grade2 = (ct2 + at2 + fe2) / 10.0;
            totalWeightedScore += grade2 * credit2;
        }

        if (numCourses >= 3) {
            System.out.print("Enter credit for Course 3: ");
            int credit3 = scanner.nextInt();
            totalCredits += credit3;

            System.out.print("Enter CT (out of 30) for Course 3: ");
            int ct3 = scanner.nextInt();

            System.out.print("Enter AT (out of 10) for Course 3: ");
            int at3 = scanner.nextInt();

            System.out.print("Enter FE (out of 60) for Course 3: ");
            int fe3 = scanner.nextInt();

            double grade3 = (ct3 + at3 + fe3) / 10.0;
            totalWeightedScore += grade3 * credit3;
        }

        double cgpa = totalWeightedScore / totalCredits;

        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("CGPA: " + String.format("%.2f", cgpa));
    }
}
