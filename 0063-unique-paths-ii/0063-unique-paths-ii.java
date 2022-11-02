class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
         if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int[][] dp = new int[n][m];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return solve(obstacleGrid, n-1, m-1, dp);
        
    }
    
    int solve(int[][] grid, int i, int j, int[][] dp){
        if(i<0 || j<0){
            return 0;
        }
        if(i==0 && j==0){
            return 1;
        }
        if(grid[i][j]==1) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int left = solve(grid, i-1, j, dp);
        int top = solve(grid, i, j-1, dp);
        return dp[i][j] = left + top;
    }
}