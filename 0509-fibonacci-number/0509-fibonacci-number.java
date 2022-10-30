class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
        
        // if(n==1){
        //     return 1;
        // }
        // if(n==0){
        //     return 0;
        // }
        // return fib(n-1) + fib(n-2);
        
    }
    
    public int solve(int n, int[] dp){
        if (dp[n]!=-1) return dp[n]; 
        if(n==1) return 1;
        if(n==0) return 0;
        return dp[n] = solve(n-1, dp) + solve(n-2, dp);
    }
}