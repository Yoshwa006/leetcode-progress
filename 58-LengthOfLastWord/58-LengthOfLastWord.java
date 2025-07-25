// Last updated: 7/25/2025, 8:54:46 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int index = s.length() - 1;


        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }


        for (int i = index; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                ans++;
            } else {
                return ans;
            }
        }

        return ans;
    }
}
