import java.util.*;
public class Stringmethods
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine());
        StringBuilder s1=new StringBuilder(sc.nextLine());
        System.out.println(s.length());
        System.out.println(s.toString().indexOf('S'));
        System.out.println(s.toString().toLowerCase());
        System.out.println(s.toString().toUpperCase());
        System.out.println(s.equals("saran"));
        System.out.println(s.toString().concat(s1.toString()));
        System.out.println(s.toString().charAt(2));
        System.out.println(s.substring(1,3));
    }
}
