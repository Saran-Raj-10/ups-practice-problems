import java.util.*;
public class Listitr
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("saran");
        list.add("Raj");
        list.add("s");
        Iterator<String> it=list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
