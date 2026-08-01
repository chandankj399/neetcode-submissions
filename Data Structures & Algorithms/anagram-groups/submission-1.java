class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();

        for (String s: strs){
            // Solution 1
            // char[] chars = s.toCharArray();
            // Arrays.sort(chars);
            // String sortedS = new String(chars);

            // Solution 2
            int[] counts = new int[26];
            for (char c: s.toCharArray()){
                counts[c - 'a']++;
            }
            String key = Arrays.toString(counts);
            groupedAnagrams.putIfAbsent(key, new ArrayList<>());
            groupedAnagrams.get(key).add(s);
        }
        
        return new ArrayList<>(groupedAnagrams.values());
    }

}
