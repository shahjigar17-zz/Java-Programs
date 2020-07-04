package Simple_loop_programs;

import java.util.*;
public class while_krishnamurthy 
{
    public static void main(String ab[])
    {
        int i,j,n,sum=0,fact,a,temp;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number:");
        n=s.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            fact=1;
            for(j=1;j<=a;j++)
            {
                fact=fact*j;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("Number is Krishnamurthy");
        }
        else
        {
            System.out.println("Number is not Krishnamurthy");
        }
    }
}
