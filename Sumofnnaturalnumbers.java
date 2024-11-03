import java.util.*;
public class Sumofnnaturalnumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(func(n));
    }
    static int func(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
            sum+=i;
        return sum;
    }
}
