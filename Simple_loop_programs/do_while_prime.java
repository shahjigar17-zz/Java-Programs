package Simple_loop_programs;

import java.util.*;
public class do_while_prime
{
    public static void main(String a[])
    {
        int n,count=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number:");
        n=s.nextInt();
        int i=1;
        do
        {
           if(n%i==0)
           {
               count++;
           }
           i++;
        }while(i<=n);
        if(count==2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
    
}
