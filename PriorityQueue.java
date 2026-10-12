import java.util.*;

class Patient {
    String name;
    String condition;
    int priority;
    Patient(String name, String condition, int priority) {
        this.name = name;
        this.condition = condition;
        this.priority = priority;
    }
}
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.priority, b.priority));
        pq.add(new Patient("Aman", "Normal", 3));
        pq.add(new Patient("Simran", "Critical", 1));
        pq.add(new Patient("Rahul", "Urgent", 2));
        pq.add(new Patient("Priya", "Critical", 1));
        System.out.println("Hospital Patient Management:");
        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " - " + p.condition);
        }
    }
}
