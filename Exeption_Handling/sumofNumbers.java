package Exeption_Handling;
import java.util.*;
class NegativeException extends Exception
{
    public NegativeException(String str)
    {
        super(str);
    }
}
class DividenbyTen extends Exception
{
    public DividenbyTen(String str)
    {
        super(str);
    }
}
class ThousandsNumber extends Exception
{
    public ThousandsNumber(String str)
    {
        super(str);
    }
}
class AboveSevenThousand extends Exception
{
    public AboveSevenThousand(String str)
    {
        super(str);
    }
}
public class sumofNumbers {
    public static void main(String args[]) {
        int numbers[]=new int[5];
        for(int i=0;i<5;i++){
            numbers[i]=Integer.parseInt(args[i]);
        }
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            try{
                if(numbers[i]<0)
                {
                    throw new NegativeException("Negative Number");
                }
                if(numbers[i]%10==0){
                    throw new DividenbyTen("Number is Divided By Ten");
                }
                if(numbers[i]>1000 && numbers[i]<2000){
                    throw new ThousandsNumber("Number is in between 1000 and 2000");
                }
                if(numbers[i]>7000){
                    throw new AboveSevenThousand("Number is above ");
                }
            }
            catch(NegativeException e){
                System.out.println(e.getMessage());
                numbers[i]=0;
            }
            catch(DividenbyTen e){
                System.out.println(e.getMessage());
                numbers[i]=0;
            }
            catch(ThousandsNumber e){
                System.out.println(e.getMessage());
                numbers[i]=0;
            }
            catch(AboveSevenThousand e){
                System.out.println(e.getMessage());
                numbers[i]=0;
            }
        }
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println("Sum of numbers is:"+sum);
    }
}
