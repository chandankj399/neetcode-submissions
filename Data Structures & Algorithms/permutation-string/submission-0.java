class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Counts = new int[26];  
        int[] s2Counts = new int[26];

        int left = 0;


        for(int i = 0; i < s1.length(); i++){
            s1Counts[s1.charAt(i) - 'a']++;
            s2Counts[s2.charAt(i) - 'a']++;
        }

        for(int right = s1.length(); right < s2.length(); right++) {
            if(Arrays.equals(s1Counts,s2Counts)) return true;
            s2Counts[s2.charAt(right) - 'a']++;
            s2Counts[s2.charAt(left++) - 'a']--;
        }
        return Arrays.equals(s1Counts, s2Counts);
    }
}
