package Exeption_Handling;
import java.util.*;
class RajviException extends Exception
{
    public RajviException(String str)
    {
        super(str);
    }
}
public class throw_demo {
    public static void main(String args[])
    {
        int no;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        no=s.nextInt();
        
        try
        {
            if(no>0)
            {
                throw new RajviException("Positive Number");
            }
            else
            {
                System.out.println("Negative Number");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
