import java.util.*;
public class Palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        StringBuilder s1=new StringBuilder(s).reverse();
        if(s.equals(s1.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not");
    }
}
