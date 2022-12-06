class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        Integer[][] dp = new Integer[n][m];
        return solve(text1, text2, n-1 , m-1,  dp);
    }

    int solve(String s1, String s2, int i ,int j, Integer[][] dp){
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = 1 + solve(s1,s2,i-1,j-1,dp);
        }else{
            return dp[i][j] = Math.max(solve(s1,s2,i-1,j,dp), solve(s1,s2,i,j-1,dp));
        }

    }
}