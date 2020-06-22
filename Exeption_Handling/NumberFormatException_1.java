package Exeption_Handling;
public class NumberFormatException_1 {
    public static void main(String[] args) {
        String s1="a";
        String s2="20";
        
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=a+b;
        System.out.println("Value of C:"+c);
    }
}
