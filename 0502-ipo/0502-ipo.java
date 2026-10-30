
import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        // Min Heap: Sort projects by required capital
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // Max Heap: Sort affordable projects by profit
        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

        // Insert all projects into Min Heap
        for (int i = 0; i < profits.length; i++) {
            minHeap.add(new int[]{capital[i], profits[i]});
        }

        // Select at most k projects
        for (int i = 0; i < k; i++) {

            // Move affordable projects into Max Heap
            while (!minHeap.isEmpty() &&
                   minHeap.peek()[0] <= w) {

                int[] project = minHeap.poll();
                maxHeap.add(project[1]);
            }

            // No affordable project available
            if (maxHeap.isEmpty()) {
                break;
            }

            // Select project with maximum profit
            w += maxHeap.poll();
        }

        return w;
    }
}
