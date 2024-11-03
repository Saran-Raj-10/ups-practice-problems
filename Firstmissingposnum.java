import java.util.*;
public class Firstmissingposnum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // to get the array size
        int n=sc.nextInt();
        // to create an array with n size
        int arr[]=new int[n];
        // to get the array element from the user
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        // sorting of the given array
        Arrays.sort(arr);
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                a=i;
                break;
            }
        }
        boolean flag=false;
        for(int i=a;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1]-1)
            {
                System.out.print(arr[i]+1);
                flag=true;
                break;
            }
        }
        if(flag==false)
            System.out.print(arr[n-1]+1);
    }
}
