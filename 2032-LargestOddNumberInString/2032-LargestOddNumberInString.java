// Last updated: 7/25/2025, 8:50:35 AM
class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length()-1; i>=0; i--){
            int k = num.charAt(i) - '0';
            if(k%2 !=0){
                return num.substring(0, i+1);
            }
        }

        return "";
    }

}