// Last updated: 7/25/2025, 8:53:35 AM
// Approach -1

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int tot = n * (n + 1) / 2;

        int currentSum = 0;
        for (int i : nums) {
            currentSum += i;
        }

        return tot - currentSum;
    }
}