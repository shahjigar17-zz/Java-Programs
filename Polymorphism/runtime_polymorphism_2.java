package Polymorphism;
class bank
{
//    void interest()
//    {
//        System.out.println("Interest is");
//    }
}
class ICICI extends bank
{
    void interest()
    {
        System.out.println("Interest rate of ICIC Bank is 7% per year");
    }
}
class SBI extends bank
{
    void interest()
    {
        System.out.println("Interest rate pf SBI Bank is 8% per year");
    }
}
class AXIS extends bank
{
    void interest()
    {
        System.out.println("Interest rate pf AXIS Bank is 9% per year");
    }
}
public class runtime_polymorphism_2 {
    public static void main(String[] args) {
        ICICI i=new ICICI();
        i.interest();
        
        SBI s=new SBI();
        s.interest();
        
        AXIS a=new AXIS();
        a.interest();
    }
}
