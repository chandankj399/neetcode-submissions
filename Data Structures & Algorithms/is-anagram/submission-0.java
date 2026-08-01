class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c: s.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

         for (char c: t.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
        }

        for (int count: charCount.values()){
            if (count != 0){
                return false;
            }
        }
        return true;

    }
}
