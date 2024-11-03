import java.util.*;
/*interface Itr<T>
{
    void add(T item);
    T get();
}*/
/*class cls<T,K>
{
    private Integer item1;
    private String item2;
    public void cls(Integer item1,String item2) {
        this.item1 = item1;
        this.item2 = item2;
    }
    public Integer get1() {
       return this.item1;
    }
    public String get2() {
        return this.item2;
    }
}
public class Main {
    public static void main(String[] args) {
        cls<Integer,String> obj = new cls<>();
        obj.cls(6,"SDFGHJ");
        System.out.println(obj.get1());
        System.out.println(obj.get2());
    }
}

public class Main
{
    public static void func(Number num)
    {
        System.out.println(num.intValue());
        System.out.println(num.doubleValue());
    }
    public static void main(String args[])
    {
        int intValue = 10;
        double doubleValue = 20.5;
        func(intValue);
        func(doubleValue);
    }
}*/

public class Main {
    public static void main(String[] args) {
        MethOverload obj=new MethOverload();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(3.5f, 2.5f));
        System.out.println(obj.add("Hello ", "World!"));
    }
}
class MethOverload
{
    public int add(int a, int b) {
        return a + b;
    }
    public float add(float a, float b) {
        return a + b;
    }
    public String add(String a, String b) {
        return a + b;
    }
}

