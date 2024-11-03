import java.util.*;
public class Matrixmultiply
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        int brr[][]=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                brr[i][j]=sc.nextInt();
        func(n,arr,brr);
    }
    static void func(int n, int arr[][], int brr[][])
    {
        int crr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                crr[i][j]=0;
                for(int k=0;k<n;k++)
                    crr[i][j]+=arr[i][k]*brr[k][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(crr[i][j]+" ");
            System.out.println();
        }
    }
}
