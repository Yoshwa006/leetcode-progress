// Last updated: 7/25/2025, 8:53:23 AM
class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length -1;

        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}