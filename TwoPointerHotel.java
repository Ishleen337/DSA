public class TwoPointerHotel {
    public static void main(String[] args) {

        int[] prices = {1500, 2000, 2500, 3000, 4500, 6000};
        int target = 7500;

        int left = 0;
        int right = prices.length - 1;

        while (left < right) {
            int sum = prices[left] + prices[right];
            if (sum == target) {
                System.out.println("Rooms found: " + prices[left] + " and " + prices[right]);
                return;
            }
            else if (sum < target) {
                left++;     
            }
            else {
                right--; 
            }
        }

        System.out.println("No pair found.");
    }
}