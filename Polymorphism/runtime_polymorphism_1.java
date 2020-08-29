package Polymorphism;
class a1
{
    void abc()
    {
        System.out.println("A1 class abc() function");
    }
}
class b1 extends a1
{
    void abc()
    {
        System.out.println("B1 class abc() function");
    }
}
class c1 extends a1
{
    void abc()
    {
        System.out.println("C1 class abc() function");
    }
}
class d1 extends a1
{
    void abc()
    {
        System.out.println("D1 class abc() function");
    }
}
public class runtime_polymorphism_1 {
    public static void main(String[] args) {
        a1 obj;
        obj=new a1();
        obj.abc();
        
        obj=new b1();
        obj.abc();
        
        obj=new c1();
        obj.abc();
        
        obj=new d1();
        obj.abc();
    }
}
