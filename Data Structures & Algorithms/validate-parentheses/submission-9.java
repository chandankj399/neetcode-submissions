class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        if  (s.length() == 0) {
            return false;
        }

        Map<Character, Character> openToCloseMap = new HashMap<>();
        openToCloseMap.put(')', '(');
        openToCloseMap.put(']', '[');
        openToCloseMap.put('}', '{');


        for (Character c : s.toCharArray()) {
            if (c.equals('(') || c.equals('[') | c.equals('{')) {
                stack.push(c);
            }
            else {
                if (!stack.isEmpty() && openToCloseMap.get(c).equals(stack.peek())) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
         
        return stack.isEmpty();
    }
    }
