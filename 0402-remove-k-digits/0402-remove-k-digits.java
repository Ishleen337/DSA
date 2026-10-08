import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {

            while (!stack.isEmpty() &&
                   k > 0 &&
                   stack.peek() > digit) {

                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // If k is still remaining, remove from the end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build answer
        StringBuilder result = new StringBuilder();

        for (char c : stack) {
            result.append(c);
        }

        // Remove leading zeros
        int i = 0;

        while (i < result.length() && result.charAt(i) == '0') {
            i++;
        }

        result = new StringBuilder(result.substring(i));

        // If nothing remains
        if (result.length() == 0) {
            return "0";
        }

        return result.toString();
    }
}