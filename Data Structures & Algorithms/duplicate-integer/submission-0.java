class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> visited = new HashSet<>();

        for (int i: nums){
            if (visited.contains(i)){
                return true;
            }
            visited.add(i);
        }
        return false;
    }
}

