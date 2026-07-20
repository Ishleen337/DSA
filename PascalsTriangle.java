import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity: O(n²)
 * Space Complexity: O(n²)
 */

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        // Generate each row
        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // Fill current row
            for (int j = 0; j <= i; j++) {

                // First and last element are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1)
                            + triangle.get(i - 1).get(j));
                }
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {

        int numRows = 5;

        List<List<Integer>> triangle = generate(numRows);

        System.out.println("Pascal's Triangle:");

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}