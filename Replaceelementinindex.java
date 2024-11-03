import java.util.*;
public class Replaceelementinindex
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
            if(i==a)
                arr[i]=b;
        for(int i:arr)
            System.out.print(i+" ");

        // delete
        int c=sc.nextInt();
        for(int i=0;i<n;i++)
            if(i==c)
                arr[i]=-1;
        for(int i:arr)
            System.out.print(i+" ");
    }
}
