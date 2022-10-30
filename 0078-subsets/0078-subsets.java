class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        backtrack(nums, subset, 0);
        return ans;
    }
    
    public void backtrack(int[] nums, List<Integer> subset, int i){
        // if(i==nums.length-1) return;
        ans.add(new ArrayList<>(subset));
        for(int j=i; j<nums.length; j++){
            subset.add(nums[j]);
            backtrack(nums, subset, j+1);
            subset.remove(subset.size()-1);
        }
        
    }
}