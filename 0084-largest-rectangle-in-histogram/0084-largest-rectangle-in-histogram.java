class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftArray = leftMonotonicSmaller(heights);
        int[] rightArray = rightMonotonicSmaller(heights);
        int maxArea = 0;
        for(int i=0; i<n; i++){
            // System.out.print(heights[leftArray[i]<0?0:leftArray[i]] + ", ");
        }
        // System.out.println("===");
        for(int i=0; i<n; i++){
            // System.out.print(heights[rightArray[i]<0?0:rightArray[i]] + ", ");
        }
        for(int i=0; i<n; i++){
            
            int h = heights[i];
            int w = Math.abs(rightArray[i] - leftArray[i] -1 );
            maxArea = Math.max(maxArea, h*w);
        }
        return maxArea;
        
    }
    
    int[] leftMonotonicSmaller(int[] heights){
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >=heights[i]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek();
            }
            
            stack.push(i);
        }
        return ans;
    }
    
    int[] rightMonotonicSmaller(int[] heights){
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >=heights[i]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                ans[i] = n;
            }else{
                ans[i] = stack.peek();
            }
            
            stack.push(i);
        }
        return ans;
    }
}