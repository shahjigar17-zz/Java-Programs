package Abstract_Interface;
interface I11
{
    void ab();
}
interface I22 extends I11
{
    void cd();
}
class A3 implements I22
{
    @Override
    public void ab()
    {
        System.out.println("ab() method");
    }
    @Override
    public void cd()
    {
        System.out.println("cd() method");
    }
}
public class Interface_with_multilevel_inheritance {
    public static void main(String[] args) {
        A3 obj=new A3();
        obj.ab();
        obj.cd();
    }
}
