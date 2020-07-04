package Object_as_arguments;
import java.util.*;
class real
{
    int x,y;
    Scanner s=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter the real part of complex number:");
        x=s.nextInt();
        System.out.println("Enter the imaginary part of complex number:");
        y=s.nextInt();
    }
    void putdata()
    {
        System.out.println("complex number:"+x+"+"+y+"i");
    }
    real addition(real A1,real A2)
    {
        real Z=new real();
        Z.x=A1.x+A2.x;
        Z.y=A1.y+A2.y;
        return Z;
    }
}
public class Program_3 {
    public static void main(String[] args) {
        real r1=new real();
        real r2=new real();
        real r3=new real();
        
        r1.getdata();
        r1.putdata();
        
        r2.getdata();
        r2.putdata();
        
        System.out.println("\nAddition of complex number");
        r3=r2.addition(r1,r2);
        r3.putdata();
    }
}
