package Abstract_Interface;
interface Q1
{
    final static int a=10;
    void ab();
}
interface Q2
{
    final static int b=20;
    void cd();
}
interface Q3 extends Q1,Q2
{
    final static int c=30;
    void xy();
}
interface Q4 extends Q3
{
    final static int d=40;
    void pq();
}
class Q5 implements Q4
{
    @Override
    public void ab()
    {
        System.out.println("value of A:"+a);
    }
    @Override
    public void cd()
    {
        System.out.println("value of B:"+b);
    }
    @Override
    public void xy()
    {
        System.out.println("value of C:"+c);
    }
    @Override
    public void pq()
    {
        System.out.println("value of D:"+d);
    }
}
public class Interface_with_Hybrid_inheritance {
    public static void main(String[] args) {
        Q5 obj=new Q5();
        obj.ab();
        obj.cd();
        obj.xy();
        obj.pq();
    }
}
