import java.util.*;
public class Array_1 
{
    public static void main(String args[])
    {
        int i,size;
        Scanner s=new Scanner(System.in);
        System.out.println("Enetr array size:");
        size=s.nextInt();
        int a[]=new int[size];
        System.out.println("Enter Array elements:");
        for(i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<size;i++)
        {
            System.out.println("Array elements:"+a[i]);
        }
        for(i=size;i>0;i--)
        {
            System.out.println("Reverse elements are:"+a[i-1]);
        }
    }
}
