package Exeption_Handling;
import java.util.*;

public class ArrayIndexOutofBoundsException_1 {
    public static void main(String[] args) {
        int size,i;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the array size:");
        size=s.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements:");
        for(i=0;i<size+1;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<size;i++)
        {
            System.out.println("Array Elements:"+a[i]);
        }
    }
}
