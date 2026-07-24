class Main {
    public static int FOccurrence(int[] arr, int target) {
        int low=0, high=arr.length-1;
        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1; 
            } else if(arr[mid]<target){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static int LOccurrence(int[] arr, int target) {
        int low=0, high=arr.length-1;
        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            } else if(arr[mid]<target){
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int first=FOccurrence(arr, target);
        int last=LOccurrence(arr, target);
        if(first==-1){
            System.out.println("Element not found");
        } else{
            System.out.println("Count: " +(last-first+1));
        }
    }
}