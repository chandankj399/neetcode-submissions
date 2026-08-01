class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int l = 0, r = 0;
        Set<Character> charSet = new HashSet<>();
        while (r < s.length()){
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
               
            }
                charSet.add(s.charAt(r));
                max = Math.max(max, r - l + 1 );
                r++;
            
        }

        return max;


    }
}
