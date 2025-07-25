// Last updated: 7/25/2025, 8:50:21 AM
class Solution {
    public int finalValueAfterOperations(String[] s) {
        int ans = 0;
        for (int i = 0; i < s.length; i++) {

            if (s[i].charAt(1) == '+') {
                ans++;
            } else {
                ans--;
            }

        }
        return ans;
    }
}