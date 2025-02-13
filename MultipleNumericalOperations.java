// Base class that provides a method to print results
class BaseClass 
{
    void printResult(String result) 
    {
        System.out.println(result);
    }
}

// Class to compute the sum of the series: 1 + 0.9 + 0.8 + ... + 0.1
class SumClass extends BaseClass 
{
    double computeSum() 
    {
        double sum=0;
        for(double i=1.0;i>=0.1;i-=0.1) 
        {
            sum+=i;
        }
        return sum;
    }
}

// Class to find GCD and LCM of two numbers
class DivisorMultipleClass extends BaseClass 
{
    int gcd(int a,int b) 
    {
        while(b!=0) 
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    int lcm(int a,int b) 
    {
        return (a*b)/gcd(a,b);
    }
}

// Class to convert numbers between Binary, Decimal, Hexadecimal, and Octal
class NumberConversionClass extends BaseClass 
{
    String toBinary(int num) 
    {
        return Integer.toBinaryString(num);
    }

    String toHexadecimal(int num) 
    {
        return Integer.toHexString(num).toUpperCase();
    }

    String toOctal(int num) 
    {
        return Integer.toOctalString(num);
    }

    int toDecimal(String num,int base) 
    {
        return Integer.parseInt(num,base);
    }
}

// Class for custom formatted printing
class CustomPrintClass extends BaseClass 
{
    void pr(String message,Object value) 
    {
        System.out.println(message+value);
    }
}

// Main class to test all functionalities
public class MultipleNumericalOperations 
{
    public static void main(String[] args) 
    {
        // Sum of series
        SumClass sumObj=new SumClass();
        double sumResult=sumObj.computeSum();
        sumObj.printResult("Sum of the series: "+sumResult);

        // GCD and LCM Calculation
        DivisorMultipleClass gcdLcmObj=new DivisorMultipleClass();
        int a=18,b=24;
        int gcd=gcdLcmObj.gcd(a,b);
        int lcm=gcdLcmObj.lcm(a,b);
        gcdLcmObj.printResult("GCD of "+a+" and "+b+": "+gcd);
        gcdLcmObj.printResult("LCM of "+a+" and "+b+": "+lcm);

        // Number Conversions
        NumberConversionClass numConvObj=new NumberConversionClass();
        int number=29;
        numConvObj.printResult("Binary of "+number+": "+numConvObj.toBinary(number));
        numConvObj.printResult("Hexadecimal of "+number+": "+numConvObj.toHexadecimal(number));
        numConvObj.printResult("Octal of "+number+": "+numConvObj.toOctal(number));

        // Custom formatted printing
        CustomPrintClass printObj = new CustomPrintClass();
        printObj.pr("Formatted Output -> Sum of Series: ",sumResult);
        printObj.pr("Formatted Output -> GCD: ",gcd);
        printObj.pr("Formatted Output -> LCM: ",lcm);
    }
}