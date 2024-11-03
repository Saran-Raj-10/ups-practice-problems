import java.util.*;
public class Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        for(int i=0;i<(len/2)+1;i++) {
            for (int j = 0; j < len; j++) {
                if (i == j || i == (len - j - 1)) {
                    System.out.print(s.charAt(j) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=(len/2)+1;i<len;i++) {
            for (int j = 0; j < len; j++) {
                if (i==j||i==(len - j - 1)) {
                    System.out.print(s.charAt(j) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
