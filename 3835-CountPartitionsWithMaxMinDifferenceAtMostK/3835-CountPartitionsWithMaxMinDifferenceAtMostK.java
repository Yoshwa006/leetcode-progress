// Last updated: 7/25/2025, 8:48:14 AM


class Solution {
    public int countPartitions(int[] nums, int k) {
        int n = nums.length;
        int MOD = 1_000_000_007;

        int[] dp = new int[n + 1];
        int[] dpPrefix = new int[n + 2];
        dp[0] = 1;
        dpPrefix[1] = 1;

        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);

            while (freqMap.lastKey() - freqMap.firstKey() > k) {
                freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                if (freqMap.get(nums[left]) == 0)
                    freqMap.remove(nums[left]);
                left++;
            }

            dp[right + 1] = (dpPrefix[right + 1] - dpPrefix[left] + MOD) % MOD;
            dpPrefix[right + 2] = (dpPrefix[right + 1] + dp[right + 1]) % MOD;
        }

        return dp[n];
    }
}
