package Exeption_Handling;
public class NullPointerException_Handling {
    public static void main(String[] args) {
        System.out.println("Hii");
        try
        {
            String str=null;
            System.out.println("String Length:"+str.length());
            System.out.println("Hello");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
