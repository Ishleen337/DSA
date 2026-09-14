class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek()); 
        System.out.println(s.pop());  
        System.out.println(s.pop());  
        System.out.println(s.peek()); 
    }
}
