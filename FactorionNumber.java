import java.util.Scanner;

public class FactorionNumber
{
  public static int factorial(int n)
  {
	  int fact=1;
	  for(int j=2;j<=n;j++)
	  {
	     fact=fact*j;
	  }
	  return fact;
  }
  public static boolean isFactorion(int tmp)
  {
    int num=tmp;
    int sum=0;
    while(tmp>0)
    {
       int digit=tmp%10;
       sum=sum+factorial(digit);
       tmp=tmp/10;
   }
   return sum==num;
 }
  public static void main(String[] args)
  {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the first number of the range: ");
     int frange=scanner.nextInt();  //frange can't be zero or, negative value.
     System.out.println("Enter the last number of the range: ");
     int lrange=scanner.nextInt();
     System.out.println("Factorion numbers in the range: ");
     boolean found=false;
     for(int i=frange;i<lrange;i++)
     {
	if(isFactorion(i))
	{
	   System.out.println(i);
           found=true;
        }
    }
    if(!found)
    {
      System.out.println("No factorion numbers found in the given range.");
    }
    scanner.close();
   }
}
