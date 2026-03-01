// Last updated: 01/03/2026, 22:30:56
class Solution {
    public long maximumMedianSum(int[] nums) {
          Arrays.sort(nums);
        int n = nums.length;
        long sum = 0;
        int k = n / 3;

       
        for (int i = n - 2; i >= k; i -= 2) {
            sum += nums[i];
        }

        return sum;
    }
}