package Abstract_Interface;
interface transport
{
    void deliver();
}
abstract class animal
{
   
}
class tiger extends animal
{
   
}
class camel extends animal implements transport
{
    @Override
    public void deliver()
    {
        System.out.println("Camel class");
    }
   
}
class deer extends animal
{
    
}
class donkey extends animal implements transport
{
    @Override
    public void deliver()
    {
        System.out.println("Donkey class"); 
    }
    
}
public class Interface_program_2 {
    public static void main(String[] args) {
        camel obj=new camel();
        obj.deliver();
        
        donkey obj1=new donkey();
        obj1.deliver();
    }
}
