// Last updated: 7/25/2025, 8:50:31 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        for(int i =0 ;i <nums.length; i++){
            ans[i] = nums[i];
        }
        int k =-1;
        for(int i= nums.length; i<ans.length; i++){
            ans[i] = nums[++k];
        }

        return ans;
    }
}