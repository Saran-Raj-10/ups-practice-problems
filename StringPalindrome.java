import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "abba";
        int count = s.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String s1 = s.substring(i, j + 1);
                if (s1.length() == 1)
                    list.add(s1);
                else {
                    StringBuilder s2 = new StringBuilder(s1).reverse();
                    if (s1.equals(s2.toString())) {
                        count++;
                        list.add(s1);
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(list);
    }
}
