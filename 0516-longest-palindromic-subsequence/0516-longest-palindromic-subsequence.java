class Solution {
    public int longestPalindromeSubseq(String s) {
        String t = s;
        int n = s.length();
        String revS = new StringBuilder(s).reverse().toString();
        Integer[][] dp = new Integer[n][n];
        return lcs(revS, s, n-1, n-1, dp);
    }

    int lcs(String a, String b, int i, int j, Integer[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)){
            return dp[i][j] = 1+lcs(a,b,i-1,j-1,dp);
        }else{
            return dp[i][j] = Math.max(lcs(a,b,i,j-1,dp), lcs(a,b,i-1,j,dp));
        }


    }
}