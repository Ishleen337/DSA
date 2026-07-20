public class MultipleTryCatch {
    public static void main(String[] args) {

        // First try-catch block
        try {
            int a = 10;
            int b = 0;
            int c = a / b;   // ArithmeticException
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught: " + e);
        }

        // Second try-catch block
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);   // ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception Caught: " + e);
        }

        System.out.println("Program continues...");
    }
}