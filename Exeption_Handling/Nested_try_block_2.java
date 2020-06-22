package Exeption_Handling;
import java.util.*;

public class Nested_try_block_2 {
    public static void main(String[] args) {
        try
        {
            int size,i;
            Scanner s=new Scanner(System.in);
            System.out.print("Enter the array size:");
                size=s.nextInt();
                
                int a[]=new int[size];
                System.out.println("Enter the array Elements:");
                for(i=0;i<size;i++)
                {
                    a[i]=s.nextInt();
                }
                System.out.println("Array Elements is:");
                for(i=0;i<size;i++)
                {
                    System.out.println(a[i]);
                }
            try
            {
                String s1="a";
                String s2="20";

                int d=Integer.parseInt(s1);
                int e=Integer.parseInt(s2);
                int f=d+e;
                System.out.println("Value of f:"+f);
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
