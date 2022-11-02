class Solution {
    int count = 0;
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] arr: dp) Arrays.fill(arr, -1);
        return solve(m,n,m-1,n-1,dp);
    }
    
    int solve(int m, int n, int i, int j, int[][]dp){
        if(i==0 && j==0){
            return 1;
            
        }
        
        if(i<0 || j<0){
            return 0;
        }
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int left = solve(m, n, i-1, j, dp);
        int top = solve(m, n, i, j-1, dp);
        dp[i][j] = left+top;
        return dp[i][j];
        
    }
}