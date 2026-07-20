import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    // Function to find duplicate elements
    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> duplicates = new ArrayList<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Find index corresponding to current number
            int index = Math.abs(nums[i]) - 1;

            // If already negative, number is duplicate
            if (nums[index] < 0) {
                duplicates.add(index + 1);
            } else {
                // Mark as visited
                nums[index] = -nums[index];
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println("Duplicate Elements: " + findDuplicates(nums));
    }
}