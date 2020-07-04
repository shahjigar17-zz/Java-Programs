package Object_as_arguments;

import java.util.Scanner;

class qwe
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
    qwe addition(qwe A1,qwe A2)
    {
        qwe Z=new qwe();
        Z.a=A1.a+A2.a;
        Z.b=A1.b+A2.b;
        return Z;
    }
}
public class Program_5 {
    public static void main(String[] args) {
        qwe r1=new qwe();
        qwe r2=new qwe();
        qwe r3=new qwe();
        
        r1.getdata();
        r1.putdata();
        
        r2.getdata();
        r2.putdata();
        System.out.println("\nAddition of two number");
        r3=r2.addition(r1,r2);
        r3.putdata();
    }
}
