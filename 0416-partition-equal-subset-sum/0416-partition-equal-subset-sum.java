class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x: nums){
            sum+=x;
        }
        if (sum%2==1) return false;

        int dp[][] = new int[nums.length][sum/2+1];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        
        return solve(nums, dp, sum/2, nums.length-1);
    }
    
    public boolean solve(int[] nums,int[][] dp,int target, int index){
        if(target==0){
            return true;
        }
        if(dp[index][target]!=-1) return dp[index][target]==1?true: false;
        
        if(index==0) return nums[0]==target;
        if(index<0) return false;
        
        boolean pick = false;
        if(target>=nums[index]){
            pick = solve(nums ,dp, target-nums[index], index-1);
        }
        
        boolean notpick = solve(nums ,dp, target, index-1);
        dp[index][target] = pick||notpick?1:0;
        return  pick||notpick;
        
    }
}