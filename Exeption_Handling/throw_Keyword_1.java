package Exeption_Handling;
import java.util.*;
class JigarException extends Exception
{
    public JigarException(String str)
    {
        super(str);
    }
}
public class throw_Keyword_1 {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=s.nextInt();
        try
        {
            if(n<0)
            {
                throw new JigarException("Negative number");
            }
            else
            {
                System.out.println("Number is positive");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
