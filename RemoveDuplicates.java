public class RemoveDuplicates{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node removeDuplicates(Node head){
        Node current=head;
        while(current != null && current.next != null){
            if (current.data==current.next.data){
                current.next=current.next.next;
            } else{
                current=current.next;
            }
        }
        return head;
    }
    static void display(Node head){
        while(head!=null){
            System.out.print(head.data + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(10);
        head.next.next=new Node(20);
        head.next.next.next=new Node(30);
        head.next.next.next.next=new Node(30);
        head.next.next.next.next.next=new Node(40);
        head=removeDuplicates(head);
        display(head);
    }
}