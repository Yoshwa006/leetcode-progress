// Last updated: 7/25/2025, 8:53:16 AM
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // for a-z


        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }


        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
