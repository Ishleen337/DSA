import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "hello";
        Deque<Character> dq = new ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            dq.push(ch);
        }
        System.out.println("Original String: " + str);
        System.out.print("Reversed String: ");
        while (!dq.isEmpty()) {
            System.out.print(dq.pop());
        }
    }
}
