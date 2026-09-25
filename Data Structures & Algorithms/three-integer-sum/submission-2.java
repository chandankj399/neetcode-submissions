public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int[] sortedNums = nums;
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < sortedNums.length - 2; i++) {
            int j = i + 1, k = sortedNums.length - 1;
            while (j < k) {
                List<Integer> triplet = new ArrayList<>();
                int sum = sortedNums[i] + sortedNums[j] + sortedNums[k];
                if (sum == 0) {
                    triplet.add(sortedNums[i]);
                    triplet.add(sortedNums[j]);
                    triplet.add(sortedNums[k]);
                    uniqueTriplets.add(triplet);
                    j += 1;
                    k -= 1;
                } else if (sum > 0) {
                    k -= 1;
                } else {
                    j += 1;
                }
            }
        }

        return new ArrayList<>(uniqueTriplets);
    }
}