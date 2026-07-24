class Main {
    public static int FindMax(int[]arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr={10, 20, 30, 40};
        int max=FindMax(arr);
        System.out.println("Maximum Element: " + max);
    }
}