class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void backtrack(int[] nums, int index, List<Integer> current,
                           List<List<Integer>> ans) {

        // Add current subset
        ans.add(new ArrayList<>(current));

        // Try including each remaining element
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);

            backtrack(nums, i + 1, current, ans);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}