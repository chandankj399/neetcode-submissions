class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charCount = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            charCount.put(s.charAt(i), charCount.getOrDefault(s.charAt(i), 0) + 1);
            charCount.put(t.charAt(i), charCount.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count: charCount.values()){
            if (count != 0){
                return false;
            }
        }
        return true;

    }
}
