import java.util.*;

public class Main {
    static int capacity = 5;
    static int[] queue = new int[capacity];
    static int front = 0;
    static int rear = -1;
    static int size = 0;
    static void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println(value + " inserted");
    }
    static void dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(queue[front] + " deleted");
        front = (front + 1) % capacity;
        size--;
        if (size == 0) {
            front = 0;
            rear = -1;
        }
    }
    static void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        display();

        dequeue();
        enqueue(40);
        display();
    }
}
