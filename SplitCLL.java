public class SplitCLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;

    // Insert at end
    static void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Split CLL into two halves
    static void split() {

        if (head == null) {
            return;
        }

        // Only one node
        if (head.next == head) {
            System.out.println("Only one node");
            return;
        }

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast.next != head &&
               fast.next.next != head) {

            slow = slow.next;
            fast = fast.next.next;
        }

        // First half head
        Node head1 = head;

        // Second half head
        Node head2 = slow.next;

        // Make first half circular
        slow.next = head1;

        // Make second half circular
        Node temp = head2;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = head2;

        // Display both lists
        System.out.println("List 1:");
        display(head1);

        System.out.println("List 2:");
        display(head2);
    }

    // Display circular list
    static void display(Node head) {

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("back to " + head.data);
    }

    public static void main(String[] args) {

        insertEnd(10);
        insertEnd(20);
        insertEnd(30);
        insertEnd(40);
        insertEnd(50);
        insertEnd(60);

        split();
    }
}