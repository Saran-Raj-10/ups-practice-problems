import java.util.*;
class Minstackprob
{
     public static void main(String[] args)
     {
         stackopr obj=new stackopr();
         obj.push(16);
         obj.push(15);
         obj.push(18);
         obj.push(20);
         obj.push(26);
         System.out.println(obj.getMin());
         System.out.println(obj.print());
     }
}
class stackopr
{
    Stack<Integer> main=new Stack<>();
    Stack<Integer> dup=new Stack<>();
    int min=0;
    public void push(int value)
    {
        main.push(value);
        if(dup.isEmpty() || value<=dup.peek())
            dup.push(value);
    }
    public void pop()
    {
        if (!main.isEmpty())
        {
            int a=main.pop();
            if(a==dup.peek())
                dup.pop();
        }
    }
    public int getMin() {
        if (!dup.isEmpty()) {
            min=dup.peek();
            return dup.peek();
        }
        return -1;
    }
    public List<Integer> print()
    {
        boolean flag=false;
        List<Integer> arr=new ArrayList<>();
        if(dup.isEmpty())
            return arr;
        for(int i=0;i<main.size();i++) {
            if (main.get(i) == min)
                flag = true;
            else if(flag == true)
                arr.add(main.get(i));
        }
        return arr;
    }
}
