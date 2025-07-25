// Last updated: 7/25/2025, 8:50:11 AM
class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
        if (run(words[i])) {
            return words[i];
        }
    }
    return "";
        }

    public boolean run(String s){
        int l =0;
        int r = s.length()-1;

        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}