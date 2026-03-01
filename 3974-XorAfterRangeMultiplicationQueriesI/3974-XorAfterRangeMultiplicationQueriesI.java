// Last updated: 01/03/2026, 22:30:40
class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        final int MOD = 1_000_000_007;
        
        
        int[][] mortavexil = queries;

    
        for (int[] q : mortavexil) {
            int li = q[0];
            int ri = q[1];
            int ki = q[2];
            int vi = q[3];

            int idx = li;
            while (idx <= ri) {
                nums[idx] = (int) (((long) nums[idx] * vi) % MOD);
                idx += ki;
            }
        }

    
        int ans = 0;
        for (int x : nums) {
            ans ^= x;
        }

        return ans;
    }
}
