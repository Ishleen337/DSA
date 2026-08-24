public class CLL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;

    // 1. Insert at Beginning
    static void insertBeginning(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            newNode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        newNode.next=head;
        temp.next=newNode;
        head=newNode;
    }

    // 2. Insert at End
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

    // 3. Insert at Position
    static void insertAtPosition(int data, int position){
        if(position<1){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            insertBeginning(data);
            return;
        }
        if(head==null){
            System.out.println("Invalid position");
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;

        for(int i=1;i<position-1;i++){
            temp=temp.next;

            if(temp==head){
                System.out.println("Invalid position");
                return;
            }
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    // 4. Delete from Beginning
    static void deleteBeginning(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=head.next;
        head=head.next;
    }

    // 5. Delete from End
    static void deleteEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
    }

    // 6. Delete by Value
    static void deleteValue(int value){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.data==value){
            deleteBeginning();
            return;
        }

        Node temp=head;

        while(temp.next!=head){
            if(temp.next.data==value){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
        System.out.println("Value not found");
    }

    // 7. Search
    static boolean search(int value){
        if(head==null){
            return false;
        }
        Node temp=head;
        do{
            if(temp.data==value){
                return true;
            }
            temp=temp.next;
        } while(temp!=head);
        return false;
    }

    // 8. Count Nodes
    static int count(){
        if(head==null){
            return 0;
        }
        int count=0;
        Node temp=head;
        do{
            count++;
            temp=temp.next;
        } while(temp!=head);
        return count;
    }

    // 9. Reverse Circular Linked List
    static void reverse(){
        if(head==null || head.next==head){
            return;
        }
        Node prev=null;
        Node current=head;
        Node next;
        do{
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        } while(current!=head);
        head.next=prev;
        head=prev;
    }

    // 10. Display
    static void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        } while(temp!=head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        insertEnd(10);
        insertEnd(20);
        insertEnd(30);
        insertEnd(40);
        System.out.println("Original List:");
        display();
        
        System.out.println("\nInsert 5 at beginning:");
        insertBeginning(5);
        display();

        System.out.println("\nInsert 25 at position 4:");
        insertAtPosition(25, 4);
        display();

        System.out.println("\nDelete beginning:");
        deleteBeginning();
        display();

        System.out.println("\nDelete end:");
        deleteEnd();
        display();

        System.out.println("\nDelete value 25:");
        deleteValue(25);
        display();

        System.out.println("\nSearch 30:");
        System.out.println(search(30));

        System.out.println("\nNumber of nodes:");
        System.out.println(count());

        System.out.println("\nReverse:");
        reverse();
        display();
    }
}