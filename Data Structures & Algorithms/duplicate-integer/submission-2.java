class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> countsMap = new HashMap();
        for(int i : nums) {
            if (countsMap.get(i) != null) {
                return true;
            }
            countsMap.put(i, 1);
        }
        return false;
    }
}