// Last updated: 7/25/2025, 8:51:05 AM
class Solution {
    public int check(int[] nums, int idx) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(idx <= nums[i]) {
                count++;
            }
        }

        return count;
    }
    public int specialArray(int[] nums) {
        int count = 0;
        for(int i = 0; i <= nums.length; i++) {
            if(check(nums, i) == i) {
                return i;
            }
        }

        return -1;
    }
}