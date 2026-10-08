import java.util.*;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] result = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }
        for (int card : deck) {
            int index = queue.remove();
            result[index] = card;
            if (!queue.isEmpty()) {
                queue.add(queue.remove());
            }
        }
        return result;
    }
}