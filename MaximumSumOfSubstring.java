class Main {
    public static int maxSum(int []arr, int k){
        int WindowSum=0;
        for(int i=0;i<k;i++)
            WindowSum+=arr[i];
            int maxSum=WindowSum;
            for(int i=k;i<arr.length;i++){
                WindowSum+=arr[i];
                WindowSum-=arr[i-k];
                maxSum=Math.max(maxSum, WindowSum);
            }
            return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,1,3,2};
        System.out.println(maxSum(arr,3));
    }
}