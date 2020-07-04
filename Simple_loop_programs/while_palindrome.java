package Simple_loop_programs;

import java.util.*;
public class while_palindrome
{
    public static void main(String args[])
    {
        int n,sum=0,temp,a;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        n=s.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            sum=(sum*10)+a;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.print("Number is pailndrome");
        }
        else
        {
            System.out.print("Number is not palindrome");
        }
    }
}
