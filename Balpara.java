import java.util.*;
public class Balpara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (s.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }
                char ch1 = s.pop();
                if ((ch == ')' && ch1 != '(') ||
                        (ch == '}' && ch1 != '{') ||
                        (ch == ']' && ch1 != '[')) {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        if (s.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
