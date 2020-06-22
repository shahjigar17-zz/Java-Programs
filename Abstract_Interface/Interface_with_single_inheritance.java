package Abstract_Interface;
interface I1
{
    void ab();
}
class A2 implements I1
{
    @Override
    public void ab()
    {
        System.out.println("Jigar");
    }
}
public class Interface_with_single_inheritance {
    public static void main(String[] args) {
        A2 obj=new A2();
        obj.ab();
    }
}
