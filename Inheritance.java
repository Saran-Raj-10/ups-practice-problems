import java.util.*;
class Aa // super class
{
    public void flow()
    {
        System.out.println("in flow A");
    }
    public void fly()
    {
        System.out.println("in fly A");
    }
}

class Bb extends Aa // subclass --> class B inherited with class A
{
    public void flew()
    {
        System.out.println("in flew b");
    }
    public void fly()
    {
        System.out.println("in fly B");
    }
}

// main class
public class Inheritance
{
    public static void main(String[] args)
    {
        // the super and subclass are nonstatic, so we have to create object for that class
        Bb obj = new Bb();
        obj.flew();
        obj.flow();
        obj.fly();
    }
}
