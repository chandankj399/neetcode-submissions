class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> allNumbers = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            if (allNumbers.contains(nums[i])){
                return true;
            }
            allNumbers.add(nums[i]);
        }
        return false;
    }
}