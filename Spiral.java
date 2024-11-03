import java.util.*;
public class Spiral
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j]=sc.nextInt();
        int l=0;
        int r=m-1;
        int t=0;
        int b=n-1;
        while(t<=b && l<=r)
        {
            for(int i=l;i<=r;i++)
                System.out.print(arr[t][i]+" ");
            t++;
            for(int i=t;i<=b;i++)
                System.out.print(arr[i][r]+" ");
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                    System.out.print(arr[b][i]+" ");
            }
            b--;
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                    System.out.print(arr[i][l]+" ");
            }
            l++;
        }
    }
}
