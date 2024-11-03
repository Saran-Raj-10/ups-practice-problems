
abstract class X
{
    public abstract void high();
    public void low()
    {
        System.out.println("in low class X");
    }
}
class Y extends X
{
    public void high()
    {
        System.out.println("in high class Y");
    }
}


public class Abstraction
{
    public static void main(String[] args)
    {
        Y obj = new Y();
        obj.high();
        obj.low();
    }
}
