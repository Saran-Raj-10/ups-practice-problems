import java.util.*;
public class ArrayListExample
{
    public static void main(String[] args)
    {
        List<String> arr = new ArrayList<>();
        arr.add("AB");
        arr.add("CD");
        arr.add("EF");
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
