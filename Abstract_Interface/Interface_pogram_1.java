package Abstract_Interface;
abstract class vegetable
{
    abstract String tostring();
}
class potato extends vegetable
{
    String color="Brown";
    @Override
    String tostring()
    {
        return color;
    }
}
class bringle extends vegetable
{
    String color="purple";
    @Override
    String tostring()
    {
        return color;
    }
}
class tomato extends vegetable
{
    String color="Red";
    @Override
    String tostring()
    {
        return color;
    }
}
public class Interface_pogram_1 {
    public static void main(String[] args) {
        potato obj=new potato();
        String a=obj.tostring();
        System.out.println("color of potato:"+a);
        
        bringle obj1=new bringle();
        String b=obj1.tostring();
        System.out.println("color of bringle:"+b);
        
        tomato obj2=new tomato();
        String c=obj2.tostring();
        System.out.println("color of tomato:"+c);
    }
}
