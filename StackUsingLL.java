public class StackUsingLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    // Push
    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int x = top.data;
        top = top.next;
        return x;
    }

    // Peek
    int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // Display
    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        StackUsingLL s = new StackUsingLL();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();         
        System.out.println(s.peek()); 

        System.out.println(s.pop());  
        System.out.println(s.pop()); 

        s.display();          
    }
}
