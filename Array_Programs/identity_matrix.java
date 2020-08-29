import java.util.*;
public class identity_matrix 
{
    public static void main(String ar[])
    {
        int i,j,count=0;
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
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j && a[i][j]==1)
                {
                    count++;
                }
            }
        }
        if(count==3)
        {
            System.out.println("Matrix is identity");
        }
        else
        {
            System.out.println("Not identity");
        }
     }
}