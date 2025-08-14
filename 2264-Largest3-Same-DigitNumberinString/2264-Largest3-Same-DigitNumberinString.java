// Last updated: 8/14/2025, 6:12:08 PM
class Solution {
    public String largestGoodInteger(String s) {
        String maxStr = "";
        for (int i = 0; i <= s.length() - 3; i++) {
            String sub = s.substring(i, i + 3);
            if (sub.charAt(0) == sub.charAt(1) && sub.charAt(1) == sub.charAt(2)) {
                if (maxStr.isEmpty() || sub.compareTo(maxStr) > 0) {
                    maxStr = sub;
                }
            }
        }
        return maxStr;
    }
}
