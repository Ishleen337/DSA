public class ReverseLL{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node reverseKGroup(Node head, int k){
        Node current=head;
        Node prev=null;
        Node next=null;
        int count=0;
        while(current!=null && count<k){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        if(next!=null){
            head.next=reverseKGroup(next,k);
        }

        return prev;
    }
    static void display(Node head){
        while(head!=null){
            System.out.print(head.data + " → ");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        int k=2;
        head=reverseKGroup(head,k);
        display(head);
    }
}