class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        if (n == 1) return nums[0];

        Arrays.fill(dp,-1);
        dp[n-1]=0;
        int skipLast = solve(nums, dp, n-2);
        // System.out.println(skipLast);
        
        Arrays.fill(dp,-1);
        nums[0]=0;
        int skipFirst = solve(nums, dp, n-1);
        // System.out.println(skipFirst);
        
        return Math.max(skipFirst, skipLast);
        
        // dp[0] = 0;
        // int prevIndex = 0;
        // for(int i=1; i<n;i++){
        //     int add = nums[i] ;
        //     if(i>1){
        //          add+= dp[i-2];
        //     }
        //     int skip = dp[i-1];
        //     dp[i] = Math.max(add, skip);
        //     prevIndex=i;
        // }
        // return dp[n-1];
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