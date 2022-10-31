//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.searchInsertK(Arr, N, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int searchInsertK(int arr[], int N, int k)
    {
        // code here
        // arr = Arrays.sort(arr);
        int i =0;
        int j =N-1;
        int ans = N;
        while(i<=j){
            int m = (i+j)/2;
            if(arr[m]==k) return m;
            if(arr[m]>k){
                ans = m;
                j = m-1;
            }else{
                i = m+1;
            }
        }
        return ans;
    }
}