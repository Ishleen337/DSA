import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Ishleen");
        students.add("Harnoor");
        students.add("Rama");

        System.out.println("Original List:");
        System.out.println(students);

        students.set(1, "Abhayraj");
        System.out.println(students);

        students.remove("Rama");
        System.out.println(students);

        System.out.println("Contains Abhayraj: " + students.contains("Abhayraj"));

        for (String name : students) {
            System.out.println(name + " ");
        }
    }
}