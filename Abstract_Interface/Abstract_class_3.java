package Abstract_Interface;
import java.util.*;
abstract class shape
{
    abstract void area(double a,double b,double r);
}
class triangle extends shape
{
    @Override
    void area(double a,double b,double r)
    {
        double c;
        c=0.5*a*b;
        System.out.println("Area of Triangle:"+c);
    }
}
class rectangle extends shape
{
    @Override
    void area(double a,double b,double r)
    {
        double c;
        c=a*b;
        System.out.println("Area of Rectangle:"+c);
    }
}
class circle extends shape
{
    @Override
    void area(double a,double b,double r)
    {
        double c;
        c=3.14*r*r;
        System.out.println("Area of circle:"+c);
    }
    
}
public class Abstract_class_3 {
    public static void main(String[] args) {
        double r,a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter height:");
        a=s.nextDouble();
        System.out.println("Enter breadth:");
        b=s.nextDouble();
        System.out.println("Enter radius:");
        r=s.nextDouble();
        
        shape obj;
        obj=new triangle();
        obj.area(a, b,r);
        
        obj=new rectangle();
        obj.area(a, b,r);
        
        obj=new circle();
        obj.area(a,b,r);
    }
}
