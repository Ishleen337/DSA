import java.util.*;
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq) {
            if (f > 0) {
                pq.add(f);
            }
        }

        Queue<int[]> q = new LinkedList<>();
        int time = 0;

        while (!pq.isEmpty() || !q.isEmpty()) {
            time++;
            if (!q.isEmpty() && q.peek()[1] <= time) {
                pq.add(q.poll()[0]);
            }

            if (!pq.isEmpty()) {
                int remaining = pq.poll() - 1;
                if (remaining > 0) {
                    q.add(new int[]{remaining, time + n + 1});
                }
            }
        }
        return time;
    }
}