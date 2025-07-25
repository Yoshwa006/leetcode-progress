// Last updated: 7/25/2025, 8:50:41 AM
class Solution {
    public int subsetXORSum(int[] nums) {
        int tot =0;
        for(int num : nums){
            tot |= num;
        }

        return tot * (1 << nums.length -1);
    }
}