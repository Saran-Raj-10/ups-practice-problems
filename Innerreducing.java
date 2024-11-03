import java.util.*;
public class Innerreducing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //int n=sc.nextInt();
        int m=sc.nextInt();//row
        int n=sc.nextInt();//col
        int len=2*n-1;
        int x=0;
        int x1=2;
        int y=n-1;
        int val=0;
        int a[][]= new int[len][len];
        while (n != 0)
        {
            for (int i = x; i <= y; i++)
            {
                for (int j = x; j <= y; j++)
                {
                    if (i == x || i == y || j == x || j == y)
                        if(val%2==0)
                        {
                            a[i][j]=x1;
                        }else{
                            a[i][j]=0;
                        }
                }
            }
            ++x;
            --y;
            --n;
            val++;
        }
        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < len; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
