package Exeption_Handling;
import java.util.*;
public class ArithmeticException_Handling {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Hi");
        try
        {
            System.out.println("Enter the value of A:");
            a=s.nextInt();
            System.out.println("Enter the value of B:");
            b=s.nextInt();
            c=a/b;
            System.out.println("Value of C:"+c);
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        System.out.println("Bye");
    }
}
