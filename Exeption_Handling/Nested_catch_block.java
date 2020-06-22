package Exeption_Handling;
public class Nested_catch_block {
    public static void main(String[] args) {
        try
        {
            int c=100/0;
            int a[]=new int[3];
            a[5]=10;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
