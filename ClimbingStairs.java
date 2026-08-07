import java.util.*;

public class ClimbingStairs{
    public static int climbStairs(int n){
        if(n==1){
            return 1;
        }
        if(n==2) {
            return 2;
        }
        int first=1;
        int second=2;
        for (int i = 3; i <= n; i++){
            int current=first+second;
            first=second;
            second=current;
        }
        return second;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of stairs: ");
        int n=s.nextInt();
        System.out.println("Total Ways: "+ climbStairs(n));
        s.close();
    }
}