import java.util.*;
public class two_d_array_p2
{
    public static void main(String ar[])
    {
        int i,j;
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Matrix A");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter Matrix B");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix A:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("  "+a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Matrix B");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("  "+b[i][j]);
            }
            System.out.println("");
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Addition of Two matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("  "+c[i][j]);
            }
            System.out.println("");
        }
    }
}
