class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();

        for (String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            groupedAnagrams.putIfAbsent(sortedS, new ArrayList<>());
            groupedAnagrams.get(sortedS).add(s);
        }
        
        return new ArrayList<>(groupedAnagrams.values());
    }

}
