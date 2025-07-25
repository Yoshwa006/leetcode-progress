// Last updated: 7/25/2025, 8:48:10 AM
class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        return canTransform(nums.clone(), k, 1) || canTransform(nums.clone(), k, -1);
    }

    private boolean canTransform(int[] nums, int k, int target) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != target) {
                nums[i] *= -1;
                nums[i + 1] *= -1;
                count++;
                if (count > k) return false;
            }
        }
        return nums[nums.length - 1] == target;
    }
}
