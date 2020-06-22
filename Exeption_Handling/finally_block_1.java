package Exeption_Handling;
public class finally_block_1 {
    public static void main(String[] args) {
        String x=args[0];
        String y=args[1];
        int power=1;
        System.out.println("Hii");
        System.out.println("Enter the value of X:");
        System.out.println("Enter the value of Y:");
        
        try
        {
            int x1=Integer.parseInt(x);
            int y1=Integer.parseInt(y);
            
            for(int i=1;i<=y1;i++)
            {
                power=power*y1;
            }
            System.out.println("Power is:"+power);   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}
