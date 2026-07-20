import java.util.ArrayList;
import java.util.Collections;

public class Framework {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("ArrayList: " + fruits);
        System.out.println("Size of ArrayList: " + fruits.size());
        System.out.println("Length of ArrayList = " + fruits.size());

        // Reverse
        Collections.reverse(fruits);
        System.out.println("Reverse: " + fruits);

        // Sort
        Collections.sort(fruits);
        System.out.println("Sorted: " + fruits);

        // Maximum element
        System.out.println("Maximum = " + Collections.max(fruits));
    }
}