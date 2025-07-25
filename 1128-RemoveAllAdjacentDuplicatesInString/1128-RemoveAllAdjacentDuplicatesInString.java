// Last updated: 7/25/2025, 8:52:08 AM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char g = s.charAt(i);
            if (!st.isEmpty() && st.peek() == g) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        StringBuilder f = new StringBuilder();
        for (Character ch : st) {
            f.append(ch);
        }
        return f.toString();
    }
}