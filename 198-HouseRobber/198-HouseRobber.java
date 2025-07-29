// Last updated: 7/29/2025, 10:41:59 PM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return houseRobber(n-1, nums, dp);
    }

    public int houseRobber(int index, int[] arr, int[] dp) {
        if (index < 0)
            return 0;

        if (dp[index] != -1)
            return dp[index];

        int rob = arr[index] + houseRobber(index - 2, arr, dp);
        int skip = houseRobber(index - 1, arr, dp);

        dp[index] = Math.max(rob, skip);
        return dp[index];
    }

}