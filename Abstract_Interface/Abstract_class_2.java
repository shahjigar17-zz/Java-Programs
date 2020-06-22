package Abstract_Interface;
import java.util.*;
abstract class A1
{
    abstract void addition(int a,int b);
    void subtraction(int c,int d)
    {
        int e;
        e=c-d;
        System.out.println("Subtraction="+e);
    }
}
class B1 extends A1
{
    @Override
    void addition(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("Addition="+c);
    }
}
public class Abstract_class_2 {
    public static void main(String[] args) {
       int a,b,c,d;
       Scanner s=new Scanner(System.in);
        System.out.println("Enter value of A:");
        a=s.nextInt();
        System.out.println("Enter value of B:");
        b=s.nextInt();
        
        A1 obj;
        obj=new B1();
        obj.addition(a, b);
         obj.subtraction(a,b);
//        System.out.println("Enter value of C:");
//        c=s.nextInt();
//        System.out.println("Enter value of D:");
//        d=s.nextInt();
       
    }
}
