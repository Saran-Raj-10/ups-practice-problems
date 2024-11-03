import java.util.*;
class Human
{
    private int age;
    private String name;

    public void getAge()
    {
        System.out.println(age);
    }
    public void getName()
    {
        System.out.println(name);
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int a=sc.nextInt();
        Human obj=new Human();
        obj.setAge(a);
        obj.setName(s);
        obj.getAge();
        obj.getName();
    }
}
