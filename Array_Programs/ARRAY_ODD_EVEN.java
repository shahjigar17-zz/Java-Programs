import java.util.*;
public class ARRAY_ODD_EVEN
{
    public static void main(String args[])
    {
        int i,size,even=0,odd=0,sum_even=0,sum_odd=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size");
        size=s.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements:");
        for(i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
         for(i=0;i<size;i++)
        {
            System.out.println("Array element:"+a[i]);
        }
         System.out.println("");
         for(i=0;i<size;i++)
         {
             if(a[i]%2==0)
             {
                 even++;
                 System.out.println("Even no is:"+a[i]);
                 sum_even=sum_even+a[i];
             }
             if(a[i]%2!=0)
             {
                 odd++;
                 System.out.println("odd no is:"+a[i]);
                 sum_odd=sum_odd+a[i];
             }
         }
         System.out.println("total odd no is:"+odd);
         System.out.println("Total even no is:"+even);
         System.out.println("Total sum of even no:"+sum_even);
         System.out.println("Total sum of odd no:"+sum_odd);
    }
}
