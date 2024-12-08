import java.util.*;
public class StringinArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String arr[]=new String[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
