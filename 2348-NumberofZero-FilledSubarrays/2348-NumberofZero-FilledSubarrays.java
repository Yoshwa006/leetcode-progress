// Last updated: 8/19/2025, 8:40:23 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0, streak = 0;
        for (int num : nums) {
            if(num == 0) streak++;
            else streak = 0;
            ans += streak;
        }
        return ans;
    }
}