class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = 0;
        int sell = 1;
        while (sell < prices.length) {
            int localMax = prices[sell] - prices[buy];
            
            if (localMax < 0) {
                buy = sell;
            }
            sell++;
            max = Math.max(localMax, max );
        }
    return max;
        
    }
}

// prices = [10, 1, 5, 6, 9, 3, 12, 0, 15]
//                                   b  s 
// diff = [-9, 4, 1, 1, -6, 0]