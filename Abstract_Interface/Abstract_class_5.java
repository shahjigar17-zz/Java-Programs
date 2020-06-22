package Abstract_Interface;
import java.util.*;
abstract class person
{
    Scanner s=new Scanner(System.in);
    String name,address,email,phone_no;
    abstract void display();

    public person() 
    {
        System.out.println("Enter the Name:");
        name=s.nextLine(); 
        System.out.println("Enter the Phone No:");
        phone_no=s.nextLine();
        System.out.println("Enter the Email Address:");
        email=s.nextLine();
        System.out.println("Enter the Address:");
        address=s.nextLine();
    }
  
}
class student extends person
{
    
    String course; 
    public student() 
    {
        System.out.println("Enter course name for student:");
        course=s.nextLine();
    }
    @Override
    void display()
    {
        System.out.println("Student Name:"+name);
        System.out.println("Course name:"+course);
        System.out.println("Student Email Id:"+email);
        System.out.println("Student Phone No:"+phone_no);
        System.out.println("Student Address:"+address);
    }
}
class employee extends person
{
    
    String office,designatation,salary;

    public employee()
    {
        System.out.println("Enter office name:");
        office=s.nextLine();
        System.out.println("Enter designatation of employee:");
        designatation=s.nextLine();
        System.out.println("Enter salary want to pay:");
        salary=s.nextLine();
    }
    @Override
    void display()
    {
        System.out.println("Employee Name:"+name);
        System.out.println("Office name:"+office);
        System.out.println("Designatation of employee:"+designatation);
        System.out.println("Salary of employee:"+salary);
        System.out.println("Employee Phone No:"+phone_no);
        System.out.println("Email address:"+salary);
        System.out.println("Employee Address:"+address);
    }
    
}
public class Abstract_class_5 {
    public static void main(String[] args) {
       
       person obj1=new student();
        System.out.println("");
       obj1.display();
       
       person obj2=new employee();
        System.out.println("");
       obj2.display();
    }
}

