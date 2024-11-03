import java.util.*;
public class Sumofnnumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print(func(n,arr));
    }
    static int func(int n, int arr[])
    {
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        return sum;
    }
}
