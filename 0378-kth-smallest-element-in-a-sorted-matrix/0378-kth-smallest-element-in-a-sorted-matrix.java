
import java.util.*;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        // Min Heap
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // Insert first element of every row
        for (int i = 0; i < n; i++) {
            pq.add(new int[]{matrix[i][0], i, 0});
        }

        // Remove smallest element k times
        int ans = 0;

        for (int i = 0; i < k; i++) {

            int[] current = pq.poll();

            ans = current[0];

            int row = current[1];
            int col = current[2];

            // Insert next element from same row
            if (col + 1 < n) {
                pq.add(new int[]{
                    matrix[row][col + 1],
                    row,
                    col + 1
                });
            }
        }

        return ans;
    }
}
