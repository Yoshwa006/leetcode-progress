// Last updated: 7/25/2025, 8:49:08 AM
class Solution {
    public List<String> getLongestSubsequence(String[] w, int[] g) {
        List<String> ans = new ArrayList<>();

        ans.add(w[0]);
        for(int i=1; i<w.length; i++){
            if(g[i] != g[i-1]){
                ans.add(w[i]);
            }
        }

        return ans;
    }
}