package Abstract_Interface;
abstract class abstract_class
{
    abstract void abc();
    void ab()
    {
        System.out.println("Base class");
    }
}
class child_class extends abstract_class
{
    @Override
    void abc()
    {
        System.out.println("Child class-1");
    }
}
class child_class_1 extends abstract_class
{
    @Override
    void abc()
    {
        System.out.println("Chils class-2");
    }
}
class child_class_2 extends abstract_class
{
    @Override
    void abc()
    {
        System.out.println("Child class-3");
    }
}
public class Abstract_class_1 {
    public static void main(String[] args) {
        child_class obj=new child_class();
        obj.ab();
        obj.abc();
        
        child_class_1 obj1=new child_class_1();
        obj1.abc();
        
        child_class_2 obj2=new child_class_2();
        obj2.abc();
    }
}
