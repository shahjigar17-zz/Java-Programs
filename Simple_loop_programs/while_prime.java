package Simple_loop_programs;

import java.util.*;
public class while_prime 
{
    public static void main(String a[])
    {
        int n,count=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number:");
        n=s.nextInt();
        int i=1;
        while(i<=n)
        {
           if(n%i==0)
           {
               count++;
           }
           i++;
        }
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
