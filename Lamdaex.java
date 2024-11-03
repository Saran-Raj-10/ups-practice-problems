import java.util.*;
/*public class Lamdaex
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;
        Operation add=(x,y) -> x+y;
        Operation subtract=(x,y) -> x-y;
        System.out.println(add.operate(a, b));
        System.out.println(subtract.operate(a, b));
    }
    interface Operation
    {
        int operate(int x, int y);
    }
}*/

import java.util.*;
public class Lamdaex {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("AAA");
        l.add("Saran");
        l.add("BB");
        l.sort((A, B) -> A.compareTo(B));
        l.forEach(System.out::println);
    }
}

