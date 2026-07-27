import java.util.*;
public class KthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr[k-1];
    }

    public static void main(String[] args) {
        int[]arr = {5, 3, 8, 4, 2};
        int k=3;
        int ans=kthSmallest(arr, k);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println(k + "rd Smallest Element = " + ans);
    }
}