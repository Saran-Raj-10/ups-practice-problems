import java.util.*;
public class GenericComapreArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int m=sc.nextInt();
        Integer brr[] =new Integer[m];
        for(int i=0;i<m;i++)
            brr[i]=sc.nextInt();
        System.out.println(compareFunc(arr,brr));
    }
    public static <T> String compareFunc(T[] arr,T[] brr)
    {
        if(arr.length!=brr.length)
            return"Not Equal!";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=brr[i])
                return "Not Equal!";
        }
        return "Equal!";
    }
}
