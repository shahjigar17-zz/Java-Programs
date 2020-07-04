package Simple_loop_programs;

import java.util.*;
public class while_perfect
{
    public static void main(String args[])
    {
        int n,sum=0,mult=1,a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=s.nextInt();
        while(n>0)
        {
            a=n%10;
            sum=sum+a;
            mult=mult*a;
            n=n/10;
        }
        if(sum==mult)
        {
            System.out.println("Number is Perfect");
        }
        else
        {
            System.out.println("Number is not perfect");
        }
        
    }
}
