import java.util.*;
public class Mergetwoarr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[m];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<m;i++)
            brr[i]=sc.nextInt();
        int len=n+m;
        int c=0;
        int crr[]=new int[len];
        for(int i=0;i<n;i++)
            crr[c++]=arr[i];
        for(int i=0;i<m;i++)
            crr[c++]=brr[i];
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(crr[j]>crr[j+1])
                {
                    int temp=crr[j];
                    crr[j]=crr[j+1];
                    crr[j+1]=temp;
                }
            }
        }
        for(int i:crr)
            System.out.print(i+" ");
    }
}
