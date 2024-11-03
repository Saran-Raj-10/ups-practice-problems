import java.util.*;
public class GenericListOddEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
            l.add(sc.nextInt());
        addOddEven(n,l);
    }
    public static <T> void addOddEven(int n,List<T> l)
    {
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++)
        {
            int num=(Integer) l.get(i);
            if(num % 2 == 0)
                even+=num;
            else
                odd+=num;
        }
        System.out.println("Odd "+odd+" "+"Even "+even);
    }
}
