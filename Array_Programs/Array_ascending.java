import java.util.*;
public class Array_ascending
{
    public static void main(String ae[])
    {
        int i,j,size,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size:");
        size=s.nextInt();
        int a[]=new int[size];
        System.out.println("Enetr the array size");
        for(i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<size;i++)
        {
            System.out.println("Array element:"+a[i]);
        }
    
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                if(a[i]<a[j])
                {
                  b=a[i];
                  a[i]=a[j];
                  a[j]=b;
                }
            }
        }
        System.out.println("Ascending order:");
        for(i=0;i<size;i++)
        {
            System.out.println(""+a[i]);
        }
    }
}
