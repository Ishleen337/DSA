public class MiddleCLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;

    // Insert at end
    static void insertEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }

    // Find middle node
    static void findMiddle(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=head && fast.next.next!=head){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle node = " + slow.data);
    }

    static void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data + " ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println();
    }

    public static void main(String[] args) {
        insertEnd(10);
        insertEnd(20);
        insertEnd(30);
        insertEnd(40);
        insertEnd(50);
        System.out.println("Circular Linked List:");
        display();
        findMiddle();
    }
}