class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxBananas = 0;
        for(int i = 0; i < piles.length; i++) {
            if(piles[i] > maxBananas) {
                maxBananas = piles[i];
            }
        }

        int left = 1, right = maxBananas, k = 0;

        while (left < right) {
            k = left + (right - left) / 2;
            if (calculateHoursToEat(piles, k) > h) {
                left = k + 1;
            } else if (calculateHoursToEat(piles, k) <= h) {
                right = k;
            }
        }
        return left;
        
    }

    private long calculateHoursToEat(int[] piles, int rate) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + rate - 1) / rate;   // ceiling division
        }
        return totalHours;
    }
}
