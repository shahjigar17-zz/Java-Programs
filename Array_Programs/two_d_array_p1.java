import java.util.*;
public class two_d_array_p1
{
    public static void main(String args[])
    {
        int i,j;
        int a[][]=new int[3][3];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Matrix A");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix A");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("  "+a[i][j]);
            }
            System.out.println("");
        }
    }
}
