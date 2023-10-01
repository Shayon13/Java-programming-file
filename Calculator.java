package calculator;
import java.util.Scanner;
public class Calculator {
     public static void main(String[]args)
    {
        Calculator obj1=new Calculator();
        obj1.diplayinformation();
        obj1.oparetion();
    }
   public void diplayinformation()
    {
        System.out.println("1 : + (Addition) a + b");
        System.out.println("2 : - (Subtraction) a - b");
        System.out.println("3 : * (Multiplication) a * b");
        System.out.println("4 : / (Division) a / b");
        System.out.println("5 : % (Modulo or remainder) a % b");
    }
   public void oparetion()
   {
       Scanner input=new Scanner(System.in);
       int a,b,n;
       float result;
       System.out.print("Enter the need calculation : ");
       n=input.nextInt();
       System.out.print("Enter the 1st number : ");
       a=input.nextInt();
       System.out.print("Enter the 2nd number : ");
       b=input.nextInt();
       
       if(n==1)
       {
           result=a+b;
           System.out.println("Addition is : "+result);
     }
       else if(n==2){
            result=a-b;
            System.out.println("Subtraction is "+result);}
      else if(n==3){
           result=a*b;
           System.out.println("Multification is : "+result);
       }
       else if(n==4){
           result=a/b;
           System.out.println("Division is : "+result);
       }
       else if(n==5){
           result=a%b;
           System.out.println("Modulo is : "+result);
       }
       System.out.println(" ");
       System.out.println("All result ");
       System.out.println("Addition is : "+(a+b));
       System.out.println("Substraction is: "+(a-b));
       System.out.println("Multification is : "+(a*b));
       System.out.println("Division is : "+(float)(a/b));
       System.out.println("Modulo is : "+(a%b));}
    
}

