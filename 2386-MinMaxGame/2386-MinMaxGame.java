// Last updated: 7/25/2025, 8:49:54 AM
class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n/2];
     if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0 ; i < n / 2; i++) {
            if (i % 2 == 0) {
                newNums[i] = Math.min(nums[2*i], nums[2*i+1]);
            } else {
                newNums[i] = Math.max(nums[2*i], nums[2*i+1]);
            } 
        }
        return minMaxGame(newNums);
    }
}