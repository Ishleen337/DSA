public class SlidingWindowBooks {
    public static void main(String[] args) {

        int[] pages = {120, 150, 200, 180, 170, 160, 210, 190, 140, 130};
        int k = 3;

        // Calculate sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += pages[i];
        }

        int maxSum = windowSum;
        int startIndex = 0;

        // Slide the window
        for (int i = k; i < pages.length; i++) {
            windowSum = windowSum - pages[i - k] + pages[i];

            if (windowSum > maxSum) {
                maxSum = windowSum;
                startIndex = i - k + 1;
            }
        }

        System.out.println("Maximum pages = " + maxSum);
        System.out.print("Books are: ");

        for (int i = startIndex; i < startIndex + k; i++) {
            System.out.print(pages[i] + " ");
        }
    }
}