
package Abstract_Interface;
interface P1
{
    void ab();
}
interface P2
{
    void ab();
}
class P3 implements P1,P2
{
    @Override
    public void ab()
    {
        System.out.println("ab() method");
    }
}
public class Interface_with_multipath_inheritance {
    public static void main(String[] args) {
        P3 obj=new P3();
        obj.ab();
    }
}
