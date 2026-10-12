import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str = "madam";
        Deque<Character> dq = new ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            dq.addLast(ch);
        }
        boolean isPalindrome = true;
        while (dq.size() > 1) {
            if (dq.removeFirst() != dq.removeLast()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is Not Palindrome");
        }
    }
}
