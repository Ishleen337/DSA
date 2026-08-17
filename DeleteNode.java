public class DeleteNode{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node deleteMiddle(Node head){
        if (head==null || head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while (fast!=null && fast.next!=null) {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
    static void display(Node head){
        while(head!=null){
            System.out.print(head.data + " → ");
            head=head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head=deleteMiddle(head);
        display(head);
    }
}