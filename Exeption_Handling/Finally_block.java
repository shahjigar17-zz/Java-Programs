package Exeption_Handling;
import java.util.*;
public class Finally_block {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of A:");
        a=s.nextInt();
        System.out.println("Enter the value of B:");
        b=s.nextInt();
        System.out.println("Hii");
        try
        {
            c=a/b;
            System.out.println("value of c:"+c);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}
