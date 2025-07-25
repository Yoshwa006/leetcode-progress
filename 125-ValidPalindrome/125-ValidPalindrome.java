// Last updated: 7/25/2025, 8:54:15 AM
class Solution {
    public boolean isPalindrome(String s) {
        String f = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 

        int l =0;
        int r = f.length()-1;
        while(l<=r){
            if(f.charAt(l) != f.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}