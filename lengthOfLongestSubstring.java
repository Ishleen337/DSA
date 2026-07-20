import java.util.*;

public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        lengthOfLongestSubstring obj = new lengthOfLongestSubstring();
        String s = "abcabcbb";
        int ans = obj.lengthOfLongestSubstring(s);
        System.out.println("Longest Substring Length = " + ans);
    }
}