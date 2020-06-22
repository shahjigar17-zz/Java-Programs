package Abstract_Interface;
interface X1
{
    void ab();
}
class X2 implements X1
{
    @Override
    public void ab()
    {
        System.out.println("x2 class ab() method");
    }
}
class X3 implements X1
{
    @Override
    public void ab()
    {
        System.out.println("x3 class ab() method");
    }
}
public class Interface_with_hierechical_inheritance {
    public static void main(String[] args) {
        X2 obj=new X2();
        obj.ab();
        X3 obj1=new X3();
        obj1.ab();
    }
}
