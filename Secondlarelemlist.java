import java.util.*;
public class Secondlarelemlist
{
    public static void main(String[] args)
    {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(10);
        arr.add(8);
        arr.add(9);
        arr.add(1);
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-2));
    }
}
