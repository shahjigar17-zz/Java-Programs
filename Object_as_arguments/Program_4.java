
package Object_as_arguments;
import java.util.*;
class f_i
{
    int feet,inch;
    Scanner s=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter Feet:");
        feet=s.nextInt();
        System.out.println("Enter Inch:");
        inch=s.nextInt();
    }
    void putdata()
    {
        System.out.println("Total Feet:"+feet+"\nTotal Inch:"+inch);
    }
    void sum(f_i F1,f_i F2)
    {
        feet=F1.feet+F2.feet;
        inch=(F1.inch+F2.inch);
        while(inch>=12)
        {
            inch=inch-12;
            ++feet;
        }
        
    }
}
public class Program_4 {
    public static void main(String args[])
    {
        f_i f1=new f_i();
        f1.getdata();
        
        f_i f2=new f_i();
        f2.getdata();
        
        f_i f3=new f_i();
        f3.sum(f1,f2);
        f3.putdata();
    }
}

