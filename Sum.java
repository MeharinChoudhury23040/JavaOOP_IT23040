import java.util.Scanner;

public class Sum{
  public static double Sumprint(double i,double s,double d){
     while(i>0)
     {
        s+=i;
        i-=d;
     }
     return s;
  }
  public static int GCD(int a,int b){
     while(b!=0)
     {
        int tmp=b;
        b=a%b;
        a=tmp;
     }
     return a;
  }
  public static int LCM(int x,int y){
     int z=(x*y)/GCD(x,y);
     return z;
  }
  public static int BaseConvert(int n,int base){
     int r=0;
     int i=0;     
     while(n>0)
     {
     int dig=n%base; 
     n=n/base;
     r=r+(dig*(int)(Math.pow(10,i)));
     i++;
     }
     return r;
  }
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int op=sc.nextInt();
     //Option 1: Sum
     if(op==1){
     double item=sc.nextDouble();
     double sum=0;
     double diff=sc.nextDouble();
     double sumf=Sumprint(item,sum,diff);
     System.out.printf("%.2f\n",sumf);
     }
     //Option 2: GCD
     else if(op==2){
     int a=sc.nextInt();
     int b=sc.nextInt();
     System.out.println(GCD(a,b));
     }
     //Option 3: LCM
     else if(op==3){
     int x=sc.nextInt();
     int y=sc.nextInt();
     System.out.println(LCM(x,y));
     }
     //Option 4: Decimal to Any Base Convert
     else if(op==4){
     int n=sc.nextInt();
     int base=sc.nextInt();
     System.out.println(BaseConvert(n,base));
     }
  }
}