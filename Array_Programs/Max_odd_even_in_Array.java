import java.util.*;
public class Max_odd_even_in_Array
{
    public static void main(String args[])
    {
        int i,even=1,odd=1;
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter Array:");
        for(i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }
        
        for(i=0;i<10;i++)
        {
            if(a[i]%2==0)
            {
                if(even==1)
                {
                    even=a[i];
                }
            else
                {
                    if(even<a[i])
                    {
                        even=a[i];
                    }
                }
            }
            else
            {
                if(odd==1)
                {
                    odd=a[i];
                }
                else
                {
                    if(odd<a[i])
                    {
                        odd=a[i];
                    }
                }
            }
        }
        System.out.println("MAX of even number:"+even);
        System.out.println("ODD of odd number:"+odd);
    }
}
