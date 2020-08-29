package Polymorphism;
class m1
{
    void ab()
    {
        System.out.println("m1 class ab() function");
    }
}
class m2 extends m1 
{
    @Override
    void ab()
    {
        System.out.println("m2 class ab() function");
    }
}
class m3 extends m2
{
    @Override
    void ab()
    {
        System.out.println("m3 class ab() function");
    }
}
public class runtime_polymorphism {
    public static void main(String[] args) {
        m1 obj;
        obj=new m1();
        obj.ab();
        
        obj=new m2();
        obj.ab();
        
        obj=new m3();
        obj.ab();
    }
}
