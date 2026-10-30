
import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        // Create Min Heap
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.val, b.val)
        );

        // Insert heads of all non-empty lists
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        // Dummy node
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Merge lists
        while (!pq.isEmpty()) {

            // Get smallest node
            ListNode node = pq.poll();

            // Attach to result
            current.next = node;
            current = current.next;

            // Insert next node from same list
            if (node.next != null) {
                pq.add(node.next);
            }
        }

        return dummy.next;
    }
}
