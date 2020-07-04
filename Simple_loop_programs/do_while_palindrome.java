package Simple_loop_programs;

import java.util.*;
public class do_while_palindrome 
{
    public static void main(String args[])
    {
        int n,sum=0,temp,a;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        n=s.nextInt();
        temp=n;
        do
        {
            a=n%10;
            sum=(sum*10)+a;
            n=n/10;
        }while(n>0);
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
