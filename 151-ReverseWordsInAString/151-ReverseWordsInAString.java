// Last updated: 7/25/2025, 8:54:07 AM
class Solution {
    public String reverseWords(String s) {
        String[] ss = s.trim().split("\\s+");

        int l =0;
        int r= ss.length-1;

        while(l<r){
            String temp = ss[l];
            ss[l] = ss[r];
            ss[r] = temp;
            l++;
            r--;
        }

        String f = String.join(" ",ss);

    return f;
    }
}