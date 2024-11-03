import java.util.*;
public class Removeduplicatesfromlist
{
    public static void main(String[] args)
    {
        List<String> arr=new ArrayList<>();
        arr.add("AB");
        arr.add("CD");
        arr.add("EF");
        arr.add("AB");
        Set<String> brr=new HashSet<>();
        for(int i=-0;i<arr.size();i++)
            brr.add(arr.get(i));
        System.out.println(brr);
    }
}
