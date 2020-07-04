package Simple_loop_programs;

import java.util.*;
public class do_while_armstrong 
{
    public static void main(String args[])
    {
        int a,n,temp,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        n=s.nextInt();
        temp=n;
        do
        {
            a=n%10;
            sum=sum+a*a*a;
            n=n/10; 
        }
        while(n>0);
        if(sum==temp)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is not Armstrong");
        }
        
    }
}
