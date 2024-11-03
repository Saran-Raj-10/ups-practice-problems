import java.util.*;
public class Sortlist
{
    public static void main(String[] args) {
        List<String> arr=new ArrayList<>();
        arr.add("ZZ");
        arr.add("AD");
        arr.add("JK");
        arr.add("AL");
        arr.add("BA");
        arr.add("CB");
        Collections.sort(arr);
        System.out.println(arr);
    }
}
