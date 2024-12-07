import java.util.*;
public class Triangle2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j==n || j==n-1 || i==n-1)
                 System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
    }
} 
    
