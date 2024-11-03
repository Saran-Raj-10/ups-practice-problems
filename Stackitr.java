import java.util.*;
public class Stackitr
{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        Iterator<Integer> i=s.iterator();
        while(i.hasNext())//normal
            System.out.println(i.next());

        //reverse
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
