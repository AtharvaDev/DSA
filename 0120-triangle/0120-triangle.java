class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int[] arr: dp) Arrays.fill(arr, -1);
        return solve(triangle, 0,0, dp);
    }
    
    int solve(List<List<Integer>> triangle, int index, int j,int[][] dp){
        if(index==triangle.size()) return 0;

        if(dp[index][j] !=-1) return dp[index][j];
            int first = triangle.get(index).get(j) + solve(triangle, index+1, j, dp);
            int second = triangle.get(index).get(j) + solve(triangle, index+1, j+1,dp);
            dp[index][j] = Math.min(first, second );
        
        return dp[index][j];
        
        
    }
}