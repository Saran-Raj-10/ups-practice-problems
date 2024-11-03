import java.util.*;
public class Lexicographicaqllystrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        //System.out.print(s1.compareTo(s2));
        System.out.println(func(s1,s2));
    }
    static int func(String s1, String s2)
    {
        for(int i=0; i<s1.length() && i<s2.length(); i++)
            if(s1.charAt(i)!=s2.charAt(i))
                return (int)s1.charAt(i)-(int)s2.charAt(i);
        if(s1.length()<s2.length())
            return s1.length()-s2.length();
        else if(s1.length()>s2.length())
            return s1.length()-s2.length();
        else
            return 0;
    }
}
