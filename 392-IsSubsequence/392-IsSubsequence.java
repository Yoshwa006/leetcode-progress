// Last updated: 7/25/2025, 8:53:14 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0, j =0, m= s.length(), n = t.length();

        while(j<n){
            if(i<m && s.charAt(i) == t.charAt(j)){
            i++;
            }
                j++;
        }

        return i == m;
    }
}