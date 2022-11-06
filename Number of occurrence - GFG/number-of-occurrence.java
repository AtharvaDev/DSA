//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int i=0;
        int j=arr.length-1;
        int firstIndex=bsFirst(arr, i, j, x);
        int lastIndex=bsLast(arr, i, j, x);
        if(lastIndex+firstIndex<0) return 0;
        int ans = lastIndex-firstIndex;
        // if(lastIndex-firstIndex)
        
        return lastIndex-firstIndex+1;
        
    }
    
    public int bsFirst(int[] nums, int i,int j, int target){
        int ans = -1;
        while(i<=j){
            int m = (i+j)/2;
            if(nums[m]>=target){
                ans=m;
                j=m-1;
            } else{
                i=m+1;
            }
        }
        if(ans==-1)return -1;
        return nums[ans]==target?ans:-1;
    }


    public int bsLast(int[] nums, int i,int j, int target){
        int ans = -1;
        while(i<=j){
            int m = (i+j)/2;
            if(nums[m]<=target){
                ans=m;
                i=m+1;
            } else{
                j=m-1;
            }
        }
        if(ans==-1)return -1;
        return nums[ans]==target?ans:-1;
    }
}