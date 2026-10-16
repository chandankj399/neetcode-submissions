class Solution {
    public String minWindow(String s, String t) {
    if (t.isEmpty()) return "";

    Map<Character, Integer> countT = new HashMap<>();
    for (char c : t.toCharArray()) {
        countT.put(c, countT.getOrDefault(c, 0) + 1);
    }

    Map<Character, Integer> window = new HashMap<>();
    int have = 0, need = countT.size();
    int[] res = {-1, -1};
    int resLen = Integer.MAX_VALUE;
    int left = 0;

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        window.put(c, window.getOrDefault(c, 0) + 1);

        if (countT.containsKey(c) && window.get(c).equals(countT.get(c))) {
            have++;
        }

        while (have == need) {
            if (right - left + 1 < resLen) {
                res[0] = left;
                res[1] = right;
                resLen = right - left + 1;
            }
            char lc = s.charAt(left);
            window.put(lc, window.get(lc) - 1);
            if (countT.containsKey(lc) && window.get(lc) < countT.get(lc)) {
                have--;
            }
            left++;
        }
    }

    return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
}


   
}
