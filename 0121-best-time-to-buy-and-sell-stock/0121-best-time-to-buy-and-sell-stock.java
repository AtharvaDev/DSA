class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            minPrice = Math.min(prices[i], minPrice);
            maxprofit = Math.max(maxprofit, prices[i]-minPrice);
        }
        return maxprofit;
    }
}