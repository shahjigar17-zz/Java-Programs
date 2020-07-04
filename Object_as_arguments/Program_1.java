
package Object_as_arguments;
import java.util.*;
class pqr
{
    int a,b;
    Scanner s=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter the value of A:");
        a=s.nextInt();
        System.out.println("Enter the value of B:");
        b=s.nextInt();
    }
    void putdata()
    {
        System.out.println("Value of A:"+a);
        System.out.println("Value of B:"+b);
    }
    void sum(pqr A1,pqr A2)
    {
        a=A1.a+A2.a;
        b=A1.b+A2.b;
    }
}
public class Program_1 {
    public static void main(String[] args) {
        pqr p1=new pqr();
        pqr p2=new pqr();
        pqr p3=new pqr();
        
        p1.getdata();
        p1.putdata();
                
                 
        p2.getdata();
        p2.putdata();
        System.out.println("Addition of two objects");
        p3.sum(p1, p2);
        p3.putdata();
    }
}
