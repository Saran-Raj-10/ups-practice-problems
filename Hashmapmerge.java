import java.util.*;
public class Hashmapmerge
{
    public static void main(String[] args) {
        HashMap<String,Integer> h1=new HashMap<>();
        h1.put("AB",1);
        h1.put("CD",2);
        h1.put("EF",3);
        HashMap<String,Integer> h2=new HashMap<>();
        h2.put("GH",10);
        h2.put("IJ",20);
        h2.put("F",30);
        h1.putAll(h2);
        System.out.println(h1);
    }
}