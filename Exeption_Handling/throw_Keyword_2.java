package Exeption_Handling;
import java.util.*;
class exe extends Exception
{
    public exe(String str)
    {
        super(str);
    }
}
public class throw_Keyword_2 {
    public static void main(String[] args) {
        int age;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age of person");
        age=s.nextInt();
        try
        {
            if(age<18)
            {
                throw new exe("You are not eligible for voteing!");
            }
            else
            {
                System.out.println("You are eligible for voteing!");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
