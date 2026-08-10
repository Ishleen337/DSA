import java.util.*;

class Combinations {
    static List<List<Integer>> ans = new ArrayList<>();
    public static void backtrack(int start, int n, int k, List<Integer>list){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start; i<=n;i++){
            list.add(i);
            backtrack(i+1, n, k, list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        int n=4;
        int k=2;
        List<Integer>list=new ArrayList<>();
        backtrack(1, n, k, list);
        System.out.println(ans);
    }
}