import java.util.*;
public class Freqelem
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Set<Integer> brr=new HashSet<>();
        for(int i=0;i<n;i++)
            brr.add(arr[i]);
        for(int i:brr)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(i==arr[j])
                    c++;
            }
            System.out.println(i+" "+c);
        }
    }
}
