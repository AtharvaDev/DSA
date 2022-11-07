//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int n = str1.length();
        int m = str2.length();
        Integer[][] dp = new Integer[n][m];
	    int k = lcs(str1, str2, n-1, m-1, dp);
	    
	    return (n-k)+(m-k);
	} 
	
	int lcs(String a, String b, int i, int j, Integer[][] dp){
	    if(i<0 || j<0) return 0;
	    if(dp[i][j]!=null) return dp[i][j];
	    if(a.charAt(i)==b.charAt(j)) return dp[i][j]= 1+lcs(a,b,i-1,j-1,dp);
	    else return dp[i][j] = Math.max(lcs(a,b,i-1,j,dp), lcs(a,b,i,j-1,dp));
	}
}