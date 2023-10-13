package polymophismTest;
import java.util.Scanner;
class month {
    int n;
    void name()
    {
        
    }  
}
class Monthname extends month
{
    @Override
    void name()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the month name : ");
        n=input.nextInt();
        System.out.print("The month name : ");
        //n=1;
        switch(n)
        {
            case 1:System.out.println("January");
            break;
            case 2:System.out.println("Fabruary");
            break;
            case 3:System.out.println("March");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.println("May");
            break;
            case 6:System.out.println("June");
            break;
            case 7:System.out.println("July");
            break;
            case 8:System.out.println("Auguest");
            break;
            case 9:System.out.println("September");
            break;
            case 10:System.out.println("October");
            break;
            case 11:System.out.println("November");
            break;
            case 12:System.out.println("December");
            break;
            
        }
    }
}
