package Abstract_Interface;
abstract class A
{
    abstract void ab();
    void cd()
    {
        System.out.println("CD() Method");
    }
}
class B extends A
{
    @Override
    void ab()
    {
        System.out.println("AB() Method");
    }
}
public class Abstract_class {
    public static void main(String[] args) {
            B obj=new B();
            obj.ab();
            obj.cd();
//            
//            A obj1;
//            obj=new B();
//            obj.ab();
//            obj.cd();
    }
}
