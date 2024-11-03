import java.util.*;
public class SmallestSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        int a = len;
        for (int i = 0; i < len; i++)
        {
            int count = 0;
            for (int j = i; j < len; j++)
            {
                count += arr[j];
                if (count >= x)
                {
                    a = Math.min(a, j - i + 1);
                    break;
                }
            }
        }
        System.out.println(a);
    }
}
