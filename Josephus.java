public class Josephus {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node createList(int n){
        Node head=new Node(1);
        Node temp=head;

        for(int i=2;i<=n;i++){
            temp.next=new Node(i);
            temp=temp.next;
        }
        temp.next=head;
        return head;
    }

    static int josephus(int n, int k){
        Node head=createList(n);
        Node prev=null;
        Node current=head;
        while(current.next!=current){
            for(int i=1;i<k;i++){
                prev=current;
                current=current.next;
            }
            prev.next=current.next;
            current=current.next;
        }
        return current.data;
    }

    public static void main(String[] args){
        int n=7;
        int k=3;
        int survivor=josephus(n, k);
        System.out.println("Survivor = " + survivor);
    }
}