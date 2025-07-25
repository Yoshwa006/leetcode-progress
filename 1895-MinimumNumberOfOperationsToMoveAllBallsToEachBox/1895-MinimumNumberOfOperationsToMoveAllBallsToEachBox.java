// Last updated: 7/25/2025, 8:50:51 AM
class Solution {
    public int[] minOperations(String s) {
        int[] ans = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length(); j++){
            if(s.charAt(j) == '1' && i!=j){
                ans[i] += Math.abs(j-i);
            }
            }
        }

        return ans;
    }
}