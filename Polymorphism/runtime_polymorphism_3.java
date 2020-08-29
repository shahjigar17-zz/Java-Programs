package Polymorphism;
class c11
{
    void abc()
    {
        System.out.println("C11 class abc() function");
    }
}
class d11 extends c11
{
    @Override
    void abc()
    {
        System.out.println("D11 class abc() function");
    }
}
class f11 extends c11
{
    @Override
    void abc()
    {
        System.out.println("F11 class abc() function");
    }
}
public class runtime_polymorphism_3 {
    public static void main(String[] args) {
        c11 obj;
        obj=new c11();
        obj.abc();
        
        obj=new d11();
        obj.abc();
        
        obj=new f11();
        obj.abc();
    }
}
