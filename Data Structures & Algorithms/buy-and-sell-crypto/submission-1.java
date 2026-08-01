class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        // Brute Force
        // for(int i = 0; i < prices.length; i++){
        //     for (int j = i +1; j < prices.length; j++){
        //         int profit = prices[j] - prices[i];
        //         maxProfit = Math.max(profit, maxProfit);
        //     }
        // }

        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[right] < prices[left]){
                left = right;
            }
            else {
            int profit = prices[right] - prices[left];
            maxProfit = Math.max(profit, maxProfit);
            
            }
            right++;
            
        }

        return maxProfit;
    }
}
