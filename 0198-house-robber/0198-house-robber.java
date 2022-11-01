class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        solve(nums, dp, n-1);
        return dp[n-1];
    }
    
    public int solve(int[] nums, int[] dp, int index){
        if(index==0) return nums[0];
        if(index<0) return 0;
        if(dp[index]!=-1) return dp[index];
        int add = nums[index] + solve(nums, dp, index-2);
        int skip = solve(nums, dp, index-1);
        return dp[index] = Math.max(add, skip);
    }
}