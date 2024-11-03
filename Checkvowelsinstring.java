import java.util.*;
public class Checkvowelsinstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String s1="aeiouAEIOU";
        int c=0;
        for(char ch : s.toCharArray())
        {
            if(s1.contains(Character.toString(ch)))
                c++;
        }
        System.out.println(c);
    }
}
