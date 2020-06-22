package Exeption_Handling;
import java.util.*;
public class Nested_try_block_1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of A:");
        a=s.nextInt();
        System.out.println("Enter the value of B:");
        b=s.nextInt();
        try
        {
            c=a/b;
            System.out.println("value of c:"+c);
            try
            {
                String str=null;
                System.out.println("String length:"+str.length());
            }
            catch(Exception e)
            {
                 System.out.println(e);
            }    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
