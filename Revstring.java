import java.util.*;
public class Revstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        StringBuilder s1=new StringBuilder(s).reverse();
        System.out.println(s1);
    }
}
