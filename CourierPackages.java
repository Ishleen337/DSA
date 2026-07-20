public class CourierPackages {
    public static void main(String[] args) {

        int[] weights = {10, 20, 25, 35, 40, 60, 75};
        int target = 100;

        int left = 0;
        int right = weights.length - 1;

        while (left < right) {

            int sum = weights[left] + weights[right];

            if (sum == target) {
                System.out.println("Packages found: "
                        + weights[left] + " kg and "
                        + weights[right] + " kg");
                return;
            } 
            else if (sum < target) {
                left++;     
            } 
            else {
                right--;     
            }
        }

        System.out.println("No suitable pair found.");
    }
}