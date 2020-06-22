package Abstract_Interface;
import java.util.*;
abstract class shape1
{
    double length,breadth,radius;
    abstract double area();
}
class triangle1 extends shape1
{

    public triangle1(double l,double b)
    {
        length=l;
        breadth=b;
    }
    @Override
    double area()
    {
        System.out.println("Area of triangle");
        return ((length*breadth)/2);
    }
}
class rectangle1 extends shape1
{

    public rectangle1(double l,double b)
    {
        length=l;
        breadth=b;
    }
    @Override
    double area()
    {
        System.out.println("Area of rectangle"); 
        return (length*breadth);
    }
}
class circle1 extends shape1
{

    public circle1(double r) 
    {
        radius=r;
    }
    @Override
    double area()
    {
        System.out.println("Area of Circle:");
        return (3.14*radius*radius);
    }
}
public class Abstract_class_4 {
    public static void main(String[] args) {
      shape1 obj;
      obj=new triangle1(10,20);
      double x=obj.area();
  
      System.out.println(x);
      obj=new circle1(10);
      double y=obj.area();
      System.out.println(y);
      obj=new rectangle1(10,5);
      double z=obj.area();
      System.out.println(z);
    }
}
