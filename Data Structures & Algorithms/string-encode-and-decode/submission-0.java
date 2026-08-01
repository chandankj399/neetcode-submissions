class Solution {

    public String encode(List<String> strs) {

        StringBuilder encodedString = new StringBuilder();
        int count = 0;
        for (String str: strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {

        int i = 0;
        List<String> result = new ArrayList<>();
        while (i < str.length()) {
            int j = i;
            StringBuilder sb = new StringBuilder();
            while (str.charAt(j) != '#'){
                sb.append(str.charAt(j++));
            }
            int length = Integer.parseInt(sb.toString());
            i = j + 1;
            j = i + length;
            result.add(str.substring(i, j));
            i = j;
        }
        
    return result;
    }
}
