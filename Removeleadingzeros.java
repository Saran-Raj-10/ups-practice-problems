import java.util.*;
public class Removeleadingzeros
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int ind=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
                ind = i;
            else
                break;
        }
        System.out.print(s.substring(ind+1,s.length()));
    }
}
