import java.util.*;
// overloading
class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }

}

// overriding
class A
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}
class B extends A
{
    public int add(int n1,int n2)
    {
        return n1+n2+1;
    }
}

// poly/morphism -- many/behaviour
// 2 types - 1) overloading 2) overriding
public class Polymorphism
{
    public static void main(String[] args)
    {
        //overloading object creation
        Calc obj = new Calc();
        int r1=obj.add(1,2,3);
        int r2=obj.add(1,2);
        System.out.println(r1+" "+r2);
        //overriding object creation
        B obj1 = new B();
        int r3=obj1.add(1,2);
        System.out.println(r3);
    }
}
