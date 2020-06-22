package Exeption_Handling;
import java.util.*;
class demo
{
    int a,b;
    Scanner s=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter the value of A:");
        a=s.nextInt();
        System.out.println("Enter thr value of B:");
        b=s.nextInt();
    }
    void putdata()
    {
        System.out.println("Value of A:"+a);
        System.out.println("Value of B:"+b);
    }
}
public class object_array {
    public static void main(String[] args) {
        int size,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size:");
        size=s.nextInt();
        
        demo obj[]=new demo[size];
        for(i=0;i<size;i++)
        {
            obj[i]=new demo();
            obj[i].getdata();
            obj[i].putdata();
        }
        System.out.println("\nValue of A:"+obj[2].a);
        System.out.println("Value of b:"+obj[2].b);
    }
}
