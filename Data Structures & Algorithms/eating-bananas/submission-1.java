class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxBananas = 0;
        for(int i = 0; i < piles.length; i++) {
            if(piles[i] > maxBananas) {
                maxBananas = piles[i];
            }
        }

        int left = 1, right = maxBananas, result = Integer.MAX_VALUE;;

        while (left <= right) {
            int k = left + (right - left) / 2;
            if (calculateHoursToEat(piles, k) <= h) {
                result = Math.min(k, result);
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return result;
        
    }

    private long calculateHoursToEat(int[] piles, int rate) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + rate - 1) / rate;   // ceiling division
        }
        return totalHours;
    }
}
