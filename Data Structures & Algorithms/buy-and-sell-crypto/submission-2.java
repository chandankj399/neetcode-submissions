class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = 0;
        int sell = 1;
        while (sell < prices.length) {
            int localMax = prices[sell] - prices[buy];
            max = Math.max(localMax, max );
            if (localMax < 0) {
                buy = sell;
            }
            sell++;
             
        }
    return max;
        
    }
}

// prices = [10, 1, 5, 6, 9, 3, 12, 0, 15]
//                                   b  s 
// diff = [-9, 4, 1, 1, -6, 0]