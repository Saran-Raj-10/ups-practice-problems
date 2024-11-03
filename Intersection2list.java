import java.util.*;
public class Intersection2list
{
    public static void main(String[] args) {
        List<String> arr=new ArrayList<>();
        arr.add("AB");
        arr.add("CD");
        arr.add("EFJ");
        arr.add("AB");
        List<String> brr=new ArrayList<>();
        brr.add("AB");
        brr.add("NM");
        brr.add("EF");
        brr.add("MM");
        brr.add("CD");
        brr.add("AB");
        brr.add("ZZ");
        for(int i=0;i<arr.size();i++)
        {
            if(brr.contains(arr.get(i)))
                System.out.println(arr.get(i)+" ");
        }
    }
}
