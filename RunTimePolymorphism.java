package polymorphism;
public class RunTimePolymorphism 
     {
    int[] a=new int[4];  
    void  department(){};
public static void main(String[] args){  
RunTimePolymorphism A =new CSE();      
A.department();
RunTimePolymorphism B =new EEE();      
B.department();
RunTimePolymorphism C =new ETE();       
C.department();
RunTimePolymorphism D =new FSET();     
D.department();
}  
        }
class CSE extends RunTimePolymorphism
{   @Override 
        void  department()
    {
        a[1]=300;
        System.out.println("CSE student number is = "+a[1]);
    }
}
class EEE extends RunTimePolymorphism
{    @Override  
        void department()
    {
        a[2]=200;
        System.out.println("EEE student number is = "+a[2]);
    }
}
class ETE extends RunTimePolymorphism
{    @Override 
     void department()
    {
        a[3]=50;
        System.out.println("ETE student number is = "+a[3]);
    } 
}
class FSET extends RunTimePolymorphism
{   @Override
     void department(){
          a[3]=50;a[2]=200; a[1]=300;
            int sum =a[1]+a[2]+a[3];
        System.out.println("Number of total FSET student is = "+sum);
    }
}