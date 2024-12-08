import java.util.*;
public class Rotationofarray {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     arr[i]=sc.nextInt();
     int k=sc.nextInt();
     int arr1[]=new int[n];
    int m=n-1;
    for(int j=0;j<n;j++)
    {
        arr1[(j+k)%m]=arr[j];
    }
    System.arraycopy(arr1,0,arr,0,n);
     System.out.println(Arrays.toString(arr));
    }
    
}
