// Last updated: 7/25/2025, 8:48:29 AM
class Solution {
    public int possibleStringCount(String s) {
        int l = 0;
        int n = s.length();
        int count =0;
        for(int i=1; i<n; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
        }

        return count+1;
    }
}