import java.util.*;
public class CoinMaker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount=sc.nextInt();
        int len=sc.nextInt();
        List<Integer> denomination=new ArrayList<>();
        for(int i=0;i<len;i++)
            denomination.add(sc.nextInt());
        Collections.sort(denomination);
        int totalcoins=0;
        Collections.reverse(denomination);
        while(amount!=0 && !denomination.isEmpty())
        {

        }
    }
}
