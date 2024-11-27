import java.sql.SQLOutput;
import java.util.*;
public class ValidparathesisSubstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int count=0;
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                open++;
            else
                close++;
            if(open==close)
                count=Math.max(count,(open+close));
            else if(open<close)
            {
                open=0;
                close=0;
            }
        }
        open=0;
        close=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='(')
                open++;
            else
                close++;
            if(open==close)
                count=Math.max(count,(open+close));
            else if(open>close)
            {
                open=0;
                close=0;
            }
        }
        System.out.println(count);
    }
}
