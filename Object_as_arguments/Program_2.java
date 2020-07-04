package Object_as_arguments;
import java.util.*;
class time
{
    int hour,sec,min;
    Scanner s=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter the Hours:");
        hour=s.nextInt();
        System.out.println("Enter the Miniuts:");
        min=s.nextInt();
        System.out.println("Enter the Seconds:");
        sec=s.nextInt();
    }
    void putdata()
    {
        System.out.println("Total Hours:"+hour);
        System.out.println("Total Miniuts:"+min);
        System.out.println("Total Seconds:"+sec);
    }
    time addition(time A1,time A2)
    {
        time X=new time();
        X.sec=A1.sec+A2.sec;
        X.min=A1.min+A2.min+X.sec/60;
        X.hour=A1.hour+A2.hour+X.min/60;
        X.min=X.min%60;
        X.sec=X.sec%60;
        return X;
    }
}
public class Program_2 {
    public static void main(String[] args) {
        time t1=new time();
        time t2=new time();
        time t3=new time();
        
        t1.getdata();
        t1.putdata();
        
        t2.getdata();
        t2.putdata();
        
        t3=t3.addition(t1, t2);
        t3.putdata();
    }
}
