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

        int matches = 0;
        for (int i = 0; i < 26; i++) {
         if (s1Counts[i] == s2Counts[i]) matches++;
        }

        for(int right = s1.length(); right < s2.length(); right++) {
            if (matches == 26) return true;
           int entering = s2.charAt(right) - 'a';
           if (s1Counts[entering] == s2Counts[entering]) matches--;
           s2Counts[entering]++;
           if (s1Counts[entering] == s2Counts[entering]) matches++;

           int leaving = s2.charAt(left) - 'a';
           if (s1Counts[leaving] == s2Counts[leaving]) matches--;
           s2Counts[leaving]--;
           if (s1Counts[leaving] == s2Counts[leaving]) matches++;
           left++;


        }
        return matches == 26;
    }
}
